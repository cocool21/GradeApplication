import java.util.Scanner;
import java.util.Date;

public class GradeAplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Date date = new Date();
		String[] name = new String[100], grade = new String[100], gender = new String[100], major = new String[100],
				origin = new String[100];
		int[] score = new int[100], genders = new int[2], majors = new int[3], state = new int[3];
		int counter = 1, totalScore = 0, femScore = 0, meanFem = 0, malScore = 0, meanMal = 0, finScore = 0,
				meanFin = 0, mathScore = 0, meanMath = 0, phyScore = 0, meanPhy = 0, mdScore = 0, meanMd = 0,
				vgScore = 0, meanVg = 0, paScore = 0, meanPa = 0;
		double mean;
		String yn, current;

		System.out.println("Enter the student record :");
		String[] record = sc.nextLine().split("\\s+");
		name[counter - 1] = record[0] + " " + record[1];
		grade[counter - 1] = record[2];
		gender[counter - 1] = record[3];
		major[counter - 1] = record[4];
		origin[counter - 1] = record[5];
		score[counter - 1] = Integer.valueOf(record[record.length - 1]);
		if (gender[counter - 1].toLowerCase().equals("m")) {
			malScore += score[counter - 1];
			genders[0]++;
			meanMal = malScore / genders[0];
		} else if (gender[counter - 1].toLowerCase().equals("f")) {
			femScore += score[counter - 1];
			genders[1]++;
			meanFem = femScore / genders[1];
		}

		if (major[counter - 1].toLowerCase().equals("finance")) {
			finScore += score[counter - 1];
			majors[0]++;
			meanFin = finScore / majors[0];
		} else if (major[counter - 1].toLowerCase().equals("math")) {
			mathScore += score[counter - 1];
			majors[1]++;
			meanMath = mathScore / majors[1];
		} else if (major[counter - 1].toLowerCase().equals("physics")) {
			phyScore += score[counter - 1];
			majors[2]++;
			meanPhy = phyScore / majors[2];
		}

		if (origin[counter - 1].toLowerCase().equals("maryland")) {
			mdScore += score[counter - 1];
			state[0]++;
			meanMd = mdScore / state[0];
		} else if (origin[counter - 1].toLowerCase().equals("virginia")) {
			vgScore += score[counter - 1];
			state[1]++;
			meanVg = vgScore / state[1];
		} else if (origin[counter - 1].toLowerCase().equals("pensylvania")) {
			paScore += score[counter - 1];
			state[2]++;
			meanPa = paScore / state[2];
		}
		totalScore += score[counter - 1];
		mean = totalScore / counter;
		System.out.println("Continue?(y/n)");
		yn = sc.nextLine();
		while (yn.toLowerCase().equals("y")) {
			counter++;
			System.out.println("Enter the student record :");
			String[] newRecord = sc.nextLine().split("\\s+");

			name[counter - 1] = newRecord[0] + " " + newRecord[1];
			grade[counter - 1] = newRecord[2];
			gender[counter - 1] = newRecord[3];
			major[counter - 1] = newRecord[4];
			origin[counter - 1] = newRecord[5];
			score[counter - 1] = Integer.valueOf(newRecord[newRecord.length - 1]);
			if (gender[counter - 1].toLowerCase().equals("m")) {
				malScore += score[counter - 1];
				genders[0]++;
				meanMal = malScore / genders[0];
			} else if (gender[counter - 1].toLowerCase().equals("f")) {
				femScore += score[counter - 1];
				genders[1]++;
				meanFem = femScore / genders[1];
			}

			if (major[counter - 1].toLowerCase().equals("finance")) {
				finScore += score[counter - 1];
				majors[0]++;
				meanFin = finScore / majors[0];
			} else if (major[counter - 1].toLowerCase().equals("math")) {
				mathScore += score[counter - 1];
				majors[1]++;
				meanMath = mathScore / majors[1];
			} else if (major[counter - 1].toLowerCase().equals("physics")) {
				phyScore += score[counter - 1];
				majors[2]++;
				meanPhy = phyScore / majors[2];
			}

			if (origin[counter - 1].toLowerCase().equals("maryland")) {
				mdScore += score[counter - 1];
				state[0]++;
				meanMd = mdScore / state[0];
			} else if (origin[counter - 1].toLowerCase().equals("virginia")) {
				vgScore += score[counter - 1];
				state[1]++;
				meanVg = vgScore / state[1];
			} else if (origin[counter - 1].toLowerCase().equals("pensylvania")) {
				paScore += score[counter - 1];
				state[2]++;
				meanPa = paScore / state[2];
			}

			totalScore += score[counter - 1];
			mean = totalScore / (counter);
			
			System.out.println("Do you want to see current result?(y/n)");
			current = sc.nextLine();
			if (current.toLowerCase().equals("y")) {
				System.out.println("Overall Average: " + mean);
				System.out.println("Average for Gender: Female=" + meanFem + " Male=" + meanMal);
				System.out
						.println("Average for Major: Finance=" + meanFin + " Math=" + meanMath + " Physics=" + meanPhy);
				System.out.println(
						"Average by State: Maryland=" + meanMd + " Virginia=" + meanVg + " Pensylvania=" + meanPa);
			}
			System.out.println("Continue?(y/n)");
			yn = sc.nextLine();

		}
		System.out.println("Report Date: " + date.toString());
		System.out.println("Number of Students: " + counter);
		System.out.println("Overall Average: " + mean);
		System.out.println("Average for Gender: Female=" + meanFem + " Male=" + meanMal);
		System.out.println("Average for Major: Finance=" + meanFin + " Math=" + meanMath + " Physics=" + meanPhy);
		System.out.println("Average by State: Maryland=" + meanMd + " Virginia=" + meanVg + " Pensylvania=" + meanPa);
		sc.close();
	}

}
