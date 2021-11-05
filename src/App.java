public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {1,3,5,7,9,2,4,6,8,10};
        int[] results = backward(numbers);
        for(int number:results){
            System.out.print(number+",");
        }

    }

    static int[] forward(int[] numbers){
        int leng = numbers.length; 
        for(int i = 0 ; i<leng ; i++){
            for (int j = i+1 ; j<leng;j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }else if(numbers[i]<numbers[j]){
                    continue;
                }
            } 
        }
        return numbers;
    }
    static int[] backward(int[] numbers){
        int leng = numbers.length; 
        for(int i = 0 ; i<leng ; i++){
            for (int j = i+1 ; j<leng;j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }else if(numbers[i] > numbers[j]){
                    continue;
                }
            } 
        }
        return numbers;
    }
}
