/*public class LC_414 {
    //This method will return a result of type int.
     public int thirdMax(int[] nums) {
        long firstMax=Long.MIN_VALUE;
        long secondMax=Long.MIN_VALUE;
        long third_Max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==firstMax||nums[i]==secondMax||nums[i]==third_Max){
                continue;
            }
            else if(nums[i]>firstMax){
                third_Max=secondMax;
                secondMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>secondMax && nums[i]<firstMax){
                third_Max=secondMax;
                secondMax=nums[i];
                    
            }
            else if(nums[i]>third_Max && nums[i]<secondMax){
                    third_Max=nums[i];
            }
        }
        if(third_Max==Long.MIN_VALUE){
            return (int)firstMax;
        }
        else{
            return (int)third_Max;
        }
        
    }
    public static void main(String[] args){
        int[] nums={10,2,10,8,12};
        LC_414 obj = new LC_414();
        System.out.println(obj.thirdMax(nums));

    }
}*/
public class LC_414 {
    //This method will return a result of type int.
    public int thirdMax(int[] nums) {
        Integer firstMax=null;
        Integer secondMax=null;
        Integer third_Max=null;
        for(int i=0;i<nums.length;i++){
            //No duplicates
            if((firstMax!=null&&nums[i]==firstMax)||
                (secondMax!=null&&nums[i]==secondMax)||
            (third_Max!=null&&nums[i]==third_Max)){
                continue;
            }
            //Greater than firstMax
            else if(firstMax==null||nums[i]>firstMax){
                third_Max=secondMax;
                secondMax=firstMax;
                firstMax=nums[i];
            }
            //between firstMax and secondMax
            else if(secondMax==null||(nums[i]>secondMax && nums[i]<firstMax)){
                   third_Max=secondMax;
                   secondMax=nums[i];
            }
            //between secondMax and third_Max
            else if(third_Max==null||nums[i]>third_Max && nums[i]<secondMax){
                    third_Max=nums[i];
            }
        }
        //if third_Max is null , that means no third max element.
        if(third_Max==null){
            return firstMax;
        }
        else {
            return third_Max;
        }
     }
    public static void main(String[] args){
        int[] nums={1,2};
        LC_414 obj = new LC_414();
        System.out.println(obj.thirdMax(nums));

    }
}