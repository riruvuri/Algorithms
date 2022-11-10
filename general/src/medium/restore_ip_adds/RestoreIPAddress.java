package medium.restore_ip_adds;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {
    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<>();
        helper(res,new StringBuilder(),s,0,0);
        return res;
    }
    //start: starting index, count: numbers added into stringbuilder
    public void helper(List<String> res, StringBuilder temp, String s,int start, int count){
        // if we are at the end and added 4 elements, add to result
        if (start==s.length() && count==4)
            res.add(temp.toString());
            // if we are not at the end and already has 4 elements-> invalid
        else if (count==4) return;

        for(int i=start; i<s.length(); i++){
            String curr = s.substring(start,i+1);
            int value = Integer.parseInt(curr);
            // check whether the number is like "0010" or "00";
            if (curr.length()>1 && curr.charAt(0)=='0') return;
            // out of range
            if (value>255) return;
            // less or equal to 255
            if (value<=255 && value>=0){
                // Backtracking
                StringBuilder rollback = new StringBuilder(temp);
                temp.append(s.substring(start,i+1));
                if (count<3) temp.append(".");

                helper(res,temp,s,i+1,count+1);
                // Rollback to previous state
                temp = rollback;
            }
        }
    }
}
