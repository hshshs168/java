public interface R {
    static void FF(){
        String boy_filePath = "img/boy.gif";
        String girl_filePath = "img/boy.gif";
        int array2d[][]={
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.print(boy_filePath+"\n"+girl_filePath+"\n");
        for (int row=0;row<array2d.length;row++){
            for (int column=0;column<array2d[0].length;column++){
                System.out.print(array2d[row][column]+"");
            }
            System.out.println();
        }
    }
}
