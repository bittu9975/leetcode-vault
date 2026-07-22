import java.util.*;

class Solution {

    static class Group {
        int start;
        int length;

        Group(int start, int length) {
            this.start = start;
            this.length = length;
        }
    }

    static class ZeroGroupInfo {
        List<Group> groups;
        int[] groupIndex;

        ZeroGroupInfo(List<Group> groups, int[] groupIndex) {
            this.groups = groups;
            this.groupIndex = groupIndex;
        }
    }

    static class IntPair {
        int first;
        int second;

        IntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class SparseTable {
        private final int[][] st;

        SparseTable(int[] nums) {
            int n = nums.length;

            if (n == 0) {
                st = new int[1][0];
                return;
            }

            st = new int[bitLength(n)][n + 1];

            System.arraycopy(nums, 0, st[0], 0, n);

            for (int i = 1; i < st.length; i++) {
                for (int j = 0; j + (1 << i) <= n; j++) {
                    st[i][j] = Math.max(st[i - 1][j],st[i - 1][j + (1 << (i - 1))]);
                }
            }
        }

        public int query(int l, int r) {
            int i = bitLength(r - l + 1) - 1;
            return Math.max(
                    st[i][l],
                    st[i][r - (1 << i) + 1]
            );
        }

        private int bitLength(int n) {
            if (n == 0) {
                return 0;
            }
            return Integer.SIZE - Integer.numberOfLeadingZeros(n);
        }
    }

    public List<Integer> maxActiveSectionsAfterTrade(String s,
                                                     int[][] queries) {

        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        ZeroGroupInfo info = getZeroGroups(s);

        List<Group> zeroGroups = info.groups;
        int[] zeroGroupIndex = info.groupIndex;

        List<Integer> answer = new ArrayList<>();

        if (zeroGroups.isEmpty()) {
            for (int i = 0; i < queries.length; i++) {
                answer.add(ones);
            }
            return answer;
        }

        SparseTable st =
                new SparseTable(getZeroMergeLengths(zeroGroups));

        for (int[] query : queries) {

            int l = query[0];
            int r = query[1];

            int left =
                    zeroGroupIndex[l] == -1
                            ? -1
                            : zeroGroups.get(zeroGroupIndex[l]).length
                            - (l - zeroGroups.get(
                            zeroGroupIndex[l]).start);

            int right =
                    zeroGroupIndex[r] == -1
                            ? -1
                            : r
                            - zeroGroups.get(
                            zeroGroupIndex[r]).start
                            + 1;

            IntPair adjacent =
                    mapToAdjacentGroupIndices(
                            zeroGroupIndex[l] + 1,
                            s.charAt(r) == '1'
                                    ? zeroGroupIndex[r]
                                    : zeroGroupIndex[r] - 1
                    );

            int startAdjacentGroupIndex = adjacent.first;
            int endAdjacentGroupIndex = adjacent.second;

            int activeSections = ones;

            if (s.charAt(l) == '0'
                    && s.charAt(r) == '0'
                    && zeroGroupIndex[l] + 1
                    == zeroGroupIndex[r]) {

                activeSections =
                        Math.max(activeSections,
                                ones + left + right);

            } else if (startAdjacentGroupIndex
                    <= endAdjacentGroupIndex) {

                activeSections =
                        Math.max(activeSections,
                                ones + st.query(
                                        startAdjacentGroupIndex,
                                        endAdjacentGroupIndex));
            }

            if (s.charAt(l) == '0'
                    && zeroGroupIndex[l] + 1
                    <= (s.charAt(r) == '1'
                    ? zeroGroupIndex[r]
                    : zeroGroupIndex[r] - 1)) {

                activeSections =
                        Math.max(activeSections,
                                ones
                                        + left
                                        + zeroGroups.get(
                                        zeroGroupIndex[l] + 1)
                                        .length);
            }

            if (s.charAt(r) == '0'
                    && zeroGroupIndex[l]
                    < zeroGroupIndex[r] - 1) {

                activeSections =
                        Math.max(activeSections,
                                ones
                                        + right
                                        + zeroGroups.get(
                                        zeroGroupIndex[r] - 1)
                                        .length);
            }

            answer.add(activeSections);
        }

        return answer;
    }

    private ZeroGroupInfo getZeroGroups(String s) {

        List<Group> zeroGroups = new ArrayList<>();
        int[] zeroGroupIndex = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {

                if (i > 0 && s.charAt(i - 1) == '0') {
                    zeroGroups.get(
                            zeroGroups.size() - 1).length++;
                } else {
                    zeroGroups.add(new Group(i, 1));
                }
            }

            zeroGroupIndex[i] = zeroGroups.size() - 1;
        }

        return new ZeroGroupInfo(
                zeroGroups,
                zeroGroupIndex
        );
    }

    private int[] getZeroMergeLengths(List<Group> zeroGroups) {

        if (zeroGroups.size() <= 1) {
            return new int[0];
        }

        int[] ans = new int[zeroGroups.size() - 1];

        for (int i = 0; i < zeroGroups.size() - 1; i++) {
            ans[i] =
                    zeroGroups.get(i).length
                            + zeroGroups.get(i + 1).length;
        }

        return ans;
    }

    private IntPair mapToAdjacentGroupIndices(
            int startGroupIndex,
            int endGroupIndex) {

        return new IntPair(
                startGroupIndex,
                endGroupIndex - 1
        );
    }
}