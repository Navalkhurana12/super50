class MyString {
  private String value = "naval";

  public MyString(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public String append(String toappend) {
    value += toappend;
    return value;
  }

  public int countWords() {
    int length = value.length();
    if (length == 0)
      return 0;
    int countWords = 0;
    for (int i = 0; i < length; i++) {
      char c = value.charAt(i);

      if (c == ' ' || c == '\t' || c == '\n')
        countWords++;
    }
    countWords++;
    return countWords;
  }

  public String replace (String newstr,String oldstr){
    String result="";
     int i=0;
     int vallen=value.length();
     int oldlen=oldstr.length();
     while(i<vallen){
      boolean match =false;
      if(i+oldlen<=vallen){
        match=true;
        for(int j=0;j<oldlen;j++){
         if(value.charAt(i+j)!=oldstr.charAt(i)){
          match=false;
          break;
         }

        }
        if(match){
          result+=newstr;
          i+=oldlen;
        }
        else{
          result+=value.charAt(i);
          i++;
        }
      }
     }
     value=result;
     return value;
    }

  public boolean isPalindrome() {
    // Step 1: Remove spaces and convert to lowercase manually
    String cleaned = "";
    for (int i = 0; i < value.length(); i++) {
        char ch = value.charAt(i);
        if (ch != ' ') { // ignore spaces
            cleaned += Character.toLowerCase(ch);
        }
    }

    // Step 2: Check palindrome manually using two pointers
    int left = 0;
    int right = cleaned.length() - 1;

    while (left < right) {
        if (cleaned.charAt(left) != cleaned.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

  
  public String splice(int start,int len){
    if (start < 0 || start + len > value.length()) {
            System.out.println("Invalid range");
            return value;
        }
      value = value.substring(0, start) + value.substring(start + len);
    return value;
  }
  public String[] split(String pattern) {
    int valLen = value.length();
    int patLen = pattern.length();
    String temp = "";
    int count = 0;

    
    for (int i = 0; i < valLen; ) {
        boolean match = false;

        if (i + patLen <= valLen) {
            match = true;
            for (int j = 0; j < patLen; j++) {
                if (value.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
        }

        if (match) {
            count++;
            i += patLen;
        } else {
            i++;
        }
    }

    // Number of parts = count + 1
    String[] parts = new String[count + 1];
    int partIndex = 0;
    temp = "";

    for (int i = 0; i < valLen; ) {
        boolean match = false;

        if (i + patLen <= valLen) {
            match = true;
            for (int j = 0; j < patLen; j++) {
                if (value.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
        }

        if (match) {
            parts[partIndex++] = temp;
            temp = "";
            i += patLen;
        } else {
            temp += value.charAt(i);
            i++;
        }
    }

    
    parts[partIndex] = temp;

    return parts;
}


public String maxRepeat() {
    if (value == null || value == "") return "";

    char maxChar = value.charAt(0);
    int maxCount = 0;

    for (int i = 0; i < value.length(); i++) {
        char current = value.charAt(i);
        int count = 0;

        for (int j = 0; j < value.length(); j++) {
            if (value.charAt(j) == current) {
                count++;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxChar = current;
        }
    }

    return "" + maxChar;
}
public String sort() {
    if (value == null || value == "") return "";

    int len = value.length();
    String str = value;

    for (int i = 0; i < len - 1; i++) {
        for (int j = 0; j < len - i - 1; j++) {
            char c1 = str.charAt(j);
            char c2 = str.charAt(j + 1);

            if (c1 > c2) {
                String before = "";
                String after = "";

                for (int k = 0; k < j; k++) before += str.charAt(k);
                for (int k = j + 2; k < len; k++) after += str.charAt(k);

                str = before + c2 + c1 + after;
            }
        }
    }

    return str;
}

public String  shift(int n) {
        
        n = n % value.length();
        value = value.substring(n) + value.substring(0, n);
		return value;
    }
public String reverse() {
    String reversed = "";
    for (int i = value.length() - 1; i >= 0; i--) {
        reversed += value.charAt(i);
    }
    return reversed;
}
	
  }
