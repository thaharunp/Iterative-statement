// stop the iteration & come out from block

class Test{
    public static void main(String agrs[]){
     int eids[]={11,12,13,14,15};
     for(int eid : eids){
        if(eid > 13){
            break;
        }
        System.out.println(eid);
     }       

    }
}