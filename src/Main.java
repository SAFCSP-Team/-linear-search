   class Main{
   public static void main(String[] args) {
      DoublyLinkedList obj = new DoublyLinkedList();
      for(int x = 1; x <= 10; x++){
      obj.insert(x);
   }
   

   int[] result = obj.linearSearch(3);
   if(result[0] == -1){
      System.out.println("no value found, the number of intration is "+result[1]);
   }else{
      System.out.println("value found and the index is"+ result[0]+" the number of intration is "+result[1]);

   }
   }}