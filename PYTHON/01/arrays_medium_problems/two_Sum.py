class Solution:
    def twosum(self, arr, target):
        nMap = {}

        for i in range(len(arr)):
            complement = target - arr[i]
            if complement in nMap:
                return [nMap[complement], i]
            nMap[arr[i]] = i
        return []

if __name__ == "__main__":
    arr = [1,6,7,3,9]
    target = int(input("Enter Target: "))

    obj = Solution()
    result = obj.twosum(arr, target)
    print(result)