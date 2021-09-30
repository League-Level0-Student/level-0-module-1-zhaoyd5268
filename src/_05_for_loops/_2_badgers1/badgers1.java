package _05_for_loops._2_badgers1;

public class badgers1 {
public static void main(String[] args) {
int badg = 0;
	int mush = 0;
	int snak = 0;
	int count = 0;
///////////////////////////////////////////////////	
while (count<2) {
	count += 1;
	while (badg!=12) {
		badg += 1;
		System.out.println("Badger");
	}
	while (mush!=3) {
	mush += 1;
		System.out.println("Mushroom");
	}
	while (snak!=1) {
		snak += 1;
		System.out.println("A Snake!");
	}
	snak = 0;
	mush = 0;
	badg = 0;
}
///////////////////////////////////////////////////
}
}

// Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger, Badger, Badger
// Mushroom, Mushroom
