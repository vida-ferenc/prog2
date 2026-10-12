class Main
{
    public static void main(String[] args) 
    {
        if(args.length !=2)
        {
            System.err.println("hibas parameterezes");
            System.exit(1);
        }
        String kapcsolo=args[0];
        String szo =args[1];
        
        switch (kapcsolo) {
            case "-upper":
                System.out.println(szo.toUpperCase());
                break;
            case "-reverse":
                StringBuilder sb= new StringBuilder(szo);
                System.out.println(sb.reverse().toString());
                break;
            case "-double":
                StringBuilder duplaz= new StringBuilder();
                for (int i=0; i < szo.length();i++) 
                {
                 char c= szo.charAt(i);
                 duplaz.append(c).append(c);
                }
                System.out.println(duplaz.toString());
                break;
        
            default:
                System.err.println("hibas parameterezes");
                System.exit(1);
                break;
        }
    }
}