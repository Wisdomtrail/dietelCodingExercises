package chapterFour;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                1.Phone book >
                2.Messages >
                3.Chat >
                4.Call register >
                5.Tones >               
                6.Settings >
                7.Call divert >
                8.Games >
                9.Calculator >
                10.remainders >
                11.Clock >
                12.Profiles >
                13.SIM service>
                """);
        System.out.println("Enter an option");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("""
                        1.Search
                        2.Services
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send b'card
                        8.Options >
                        9.Speed dials
                        10.Voice tags
                        11.Exit
                        """);

                int option = input.nextInt();
                if (option == 8) {
                    System.out.println("1.Type of view");
                    System.out.println("2.Memory status");
                }
                break;

            case 2:
                System.out.println("""
                1.Write messages
                2.inbox
                3.output
                4.picture messages
                5.Templates
                6.Smileys
                7.Message settings >
                8.info service
                9.Voice mailbox number
                10.Service command editor""");
                int message_settings = input.nextInt();
                if (message_settings == 7) {
                    System.out.println("1. Set1 >");
                    System.out.println("2. Common >");
                }
                    int set1 = input.nextInt();
                    if (set1 == 1) {
                        System.out.println("""
                        1.Message center number
                        2.Message sent as
                        3.Message validity""");
                    } else if (set1 == 2) {
                        System.out.println("""
                        1.Delivery reports
                        2.Reply via same centre
                        3.Character support""");
                    }
                    break;
            case 3:
                System.out.println("""
                                ==***=>
                                <=====
                                """);
            case 4:
                System.out.println("""
                        1.Missed calls
                        2.Received calls
                        3.Dialed numbers
                        4.Erase recent call list
                        5.Show call duration >
                        6.Show call costs >
                        7.Call cost settings >
                        8.Prepaid credit
                        """);
                int num2 = input.nextInt();
                switch (num2){
                    case 5:
                        System.out.println("""
                                1.Last call duration
                                2.All calls duration
                                3.Received calls duration
                                """);
                        break;
                    case 6:
                        System.out.println("""
                                1.Last call cost
                                2.All calls cost
                                3.Clear counters""");
                        break;
                    case 7:
                        System.out.println("""
                                1.Call cost limit
                                2.Show costs in
                                """);
                }
            case 5:
                System.out.println("""
                        1.Ringing tone
                        2.Ringing volume
                        3.Incoming call alert
                        4.Composer
                        6.Keypad tones
                        7.Warning and game tones
                        8.Vibrating alert
                        9.Screen saver
                        """);
        }

    }
}