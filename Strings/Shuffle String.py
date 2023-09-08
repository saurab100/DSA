class Solution(object):
    def restoreString(self, s, indices):
        """
        :type s: str
        :type indices: List[int]
        :rtype: str
        """
        # x = [0] * len(indices)
        # j = 0
        # for i in indices:
        #     x[i] = s[j]
        #     # print(i,x[i],j,s[j])
        #     j += 1
        # print("".join(x))
        coordinates = []

        # create list of tuple coordinates containing the corresponding index in indices and s
        for i in range(len(indices)):
            coordinates.append((indices[i], s[i]))

        # sort the list so that the letter that should be at the 0th position in the new string will go first
        coordinates.sort()

        new_str = ""

        # just extract the letter from each tuple and add it to the accumulator for the new string
        for pair in coordinates:
            new_str += pair[2]

        return new_str

aa = Solution()
aa.restoreString("codeleet",[4,5,6,7,0,2,1,3])