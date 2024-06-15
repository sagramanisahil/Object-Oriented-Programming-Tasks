class Immutable {
    public static void main(String[] args) {
        String s1 = "Sahil";
        
        char[] c = s1.toCharArray();
        
        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        
        String reversedString = new String(c);
        
        System.out.println("Reversed string: " + reversedString);
    }
}
