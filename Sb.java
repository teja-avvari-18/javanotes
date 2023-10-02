
// String Buffer is thread safe while String Builder is not thread safe


class Sb
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Teja");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Avvari");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(2,"j");
        System.out.println(sb);
        sb.setLength(30);
        sb.ensureCapacity(100); 
        System.out.println(sb.capacity());

        // String str = sb.toString(); // Converts String Buffer to String
        // System.out.println(str);
    }
}