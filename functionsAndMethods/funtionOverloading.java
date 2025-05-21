package functionsAndMethods;

// fxn overloading using datatype

class funtionOverloading {
    // fxn to cal int sum
    public static int sum(int a,int b){
        return a + b;
    }
    // fxn to cal float sum
    public static float sum(float a,float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(7, 0));
        System.out.println(sum(7.0f,0.0f));
    }
}

// fxn overloaing using parameters 

// class funtionOverloading {
//     // fxn to calculate sum of 2
//     public static int sum(int a,int b){
//         return a + b;
//     }
//     // fxn to calculate sum of 3
//     public static int sum(int a,int b,int c){
//         return a + b + c;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(7, 0));
//         System.out.println(sum(7, 0,9));
//     }
// }