package easy14.bad_version;

public class BadVersion {
    public int firstBadVersion(int n, int badVersion) {
        VersionControl versionControl = new VersionControl(badVersion);

        int start = 1, end = n;
        int minBadVersion = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (versionControl.isBadVersion(mid)) {
                minBadVersion = Math.min(mid, minBadVersion);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return minBadVersion;
    }
}

class VersionControl {
    int badVersion = -1;
    VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int badVersion) {
        return badVersion >= this.badVersion;
    }
}
