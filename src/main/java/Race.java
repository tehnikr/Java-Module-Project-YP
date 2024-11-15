import java.util.ArrayList;

public class Race {
    String leaderCarName = "";
    int maxDist = 0;

    ArrayList<Car> Cars = new ArrayList<>();

    void addCarToRace(Car c){
        Cars.add(c);
        int newDist = 24*c.speed;
        if (newDist>maxDist){
            leaderCarName = c.brand;
            maxDist = newDist;
        }
    }

    String getWinner (){
        return leaderCarName;
    }

    int getNumberCarInRace(){
        return Cars.size();
    }

}