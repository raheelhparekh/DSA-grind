Character.isUpperCase(ch)  // to check for a character is upper case or not where ch=word.charAt(index)
word.indexOf(c)            // directly gives us the index of the character c in the word
s.split(" ")    // splits string when encounter a single white space
s.split("\\s+") // splits string when encounter one or more white spaces
s.trim()        // removes string before and after the word

Maths
XOR of a number with itself = 0

HashMap 
            // To store all values in hashMap
            // instead of writitng this code 
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int count=map.get(nums[i]);
                count++;
                map.put(nums[i],count);
            }
            // we can write this code , cleaner and shorter
            for (int num : nums) 
            {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // To get the key and value from the hashMap
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
            }


Queue
Queue.poll() --> gets you the current head of the queue
Queue.size() --> gives you the size of the queue