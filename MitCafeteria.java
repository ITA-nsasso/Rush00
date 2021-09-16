import java.util.Scanner;

class MitCafeteria{
    public static void main(){

        String staff = ["Marcus", "Lateefa", "Donald", "Rashad", "Quincy", "Mia"];
        String cafeteria = ["Lobby", "Dining Room", "Kitchen"];
        int shifts = [0, 1, 2, 3, 4, 5, 6, 7];

        staffLen = staff.length();
    }
}

Day 01 : Lobby [ Marcus & Lateefa ] DR [ Donald & Rashad ] Kitchen [ Quincy & Mia ]
Day 02 : Lobby [ Donald & Quincy ] DR [ Marcus & Mia ] Kitchen [ Lateefa & Rashad ]
Day 03 : Lobby [ Mia & Rashad ] DR [ Lateefa & Quincy ] Kitchen [ Donald & Marcus ]
Day 04 : Lobby [ Mia & Donald ] DR [ Lateefa & Donald ] Kitchen [ Quincy & Marcus ]
Day 05 : Lobby [ Mia & Rashad ] DR [ Lateefa & Quincy ] Kitchen [ Donald & Marcus ]

Day 01 : Lobby [ Marcus & Lateefa ]  DR [ Donald & Rashad ] Kitchen [Quincy & Mia]
Day 02 : Lobby                       DR [ Marcus & Donald ] Kitchen [ Lateefa & Rashad ]
Day 03 : Lobby                       DR [ Lateefa & Donald] Kitchen [ Marcus & Rashad ]
Day 04 : Lobby [ Marcus & Quincy ]   DR [ Lateefa & Rashad ] Kitchen 
Day 05 : Lobby [ Lateefa & Mia ]     DR [ Marcus & Mia ] Kitchen