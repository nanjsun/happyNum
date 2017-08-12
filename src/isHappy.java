public class isHappy {
    public int count = 0;
    boolean flag = false;
    public boolean isHappy(int n) {

        if (n == 1){
            flag = true;
            System.out.println("--->flag:"+flag);

            return flag;
        }
        if (n == 2 || n == 4){
            flag = false;
            System.out.println("--->flag:"+flag);
            return flag;

        }

        int temp = 0;
        int index = 0;

        for(int i = 5; i > -1; i --){
            index = (int)(n/(int)Math.pow(10,i));
            System.out.println("---->index:"+index);

            temp += (int)Math.pow(index, 2);
            n = n - ((int)Math.pow(10,i) * index);
            System.out.println("---->temp:"+temp);
        }
        n = temp;
        System.out.println("--->n:"+n);
        count ++;
        if(count == 99){
            flag =  false;
            return flag;
        }

        System.out.println("--->count:"+count);
        System.out.println("##############");
        this.isHappy(n);

        System.out.println("--->flag:"+flag);
        return flag;
    }
}