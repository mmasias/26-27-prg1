class RetoCCCF{
    public static void main (String[]args){
        final int minpacks = 10;
        final int maxpacks = 15;
        final int minstotal = 720;
        int mins = 0;
        int clientes = 0;
        int packscaja1 = 0;
        int packscaja2 = 0;
        int packscaja3 = 0;
        int packscaja4 = 0;
        while (mins < minstotal){
            int pcliente = (int) (Math.random() * 100);
            if (pcliente < 60){
                clientes++;
            }
            if (clientes > 0 && packscaja1 == 0){
                packscaja1 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
            }else if (packscaja1 > 0){
                packscaja1--;
            }
            if (clientes > 0 && packscaja2 == 0){
                packscaja2 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
            }else if (packscaja2 > 0){
                packscaja2--;
            }  
            if (clientes > 0 && packscaja3 == 0){
                packscaja3 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
            }else if (packscaja3 > 0){
                packscaja3--;
            }
            if (clientes > 0 && packscaja4 == 0){
                packscaja4 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
            }else if (packscaja4 > 0){
                packscaja4--;
            }
            mins++;
        }
    }
}