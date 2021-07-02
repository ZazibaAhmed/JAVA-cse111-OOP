/**
 * 
 * 
 * Ei class ta database manage kore
  
  */

public class StudentDatabase{
    
    Student [] records;
    
    /**
     * Eita diye vaat khawa jai
     */
    void printDatabase(){
        int c=0; /* jj*/
        while(c<records.length){ //5
            System.out.println(records[c].toString());
            ++c;
        }
    }
    /**
     * eita name diye sory kore dey
     * This takes no parameter
     */
    void sortByName(){
        for(int j=0;j<records.length;j++){
            Student smallest=records[j];
            int smallestPosition=j;
            int i=smallestPosition+1;
            for(int index=i;index<records.length;index++)
            {
                String a=records[index].name; 
                String b=records[j].name;
                if(((a).compareTo(b))<0){
                    smallest=records[index];
                    smallestPosition=index;
                }
                records[smallestPosition]=records[j];
                records[j]=smallest;
            }
        }
        
    }
    void sortByID(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){// "batman".compareTo("badman")  
                if(records[j-1].id.compareTo(records[j].id)>0){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
    void sortBySection(){
        for(int j=0;j<records.length;j++){
            Student smallest=records[j];
            int smallestPosition=j;
            int i=smallestPosition+1;
            for(int index=i;index<records.length;index++)
            {
                String a=records[index].name; 
                String b=records[j].name;
                if(((a).compareTo(b))<0){
                    smallest=records[index];
                    smallestPosition=index;
                }
                records[smallestPosition]=records[j];
                records[j]=smallest;
            }
        }
    }
    void sortByMark(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){
                if(records[j-1].mark > records[j].mark){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
}
