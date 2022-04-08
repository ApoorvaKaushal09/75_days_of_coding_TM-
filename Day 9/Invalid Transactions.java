import java.util.*;
class Solution {
    static class Trans{
        String name,city;
        int time,amount;
    }
    public List<String> invalidTransactions(String[] transactions) {
        Trans trans[] = new Trans[transactions.length];
        for(int i = 0; i < transactions.length; i++){
            Trans temp = new Trans();
            String data[] = transactions[i].split(",");
            temp.name = data[0];
            temp.city = data[3];
            temp.time = Integer.parseInt(data[1]);
            temp.amount = Integer.parseInt(data[2]);
            trans[i] = temp;
        }
        List<String> res = new ArrayList<>();
        for(int i=0;i<transactions.length;i++){
            for(int j=0;j<transactions.length;j++){
                if(i==j){
                    continue;
                }
                else if(trans[i].name.equals(trans[j].name) && Math.abs(trans[i].time-trans[j].time)<=60 && 
                        !trans[i].city.equals(trans[j].city)){
                    res.add(transactions[i]);
                    break;
                }else if(trans[i].amount>1000){
                    res.add(transactions[i]);
                    break;
                }
            }
        }
        return res;
    }
}