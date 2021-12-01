import java.util.ArrayList;

public class CharacterRegistry {
    private ArrayList<Character> characters;

    public CharacterRegistry() {
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public boolean newCharacter(String aName){
        Character aCharacter = new Character(aName);
        if(!characters.contains(aCharacter)){
            characters.add(aCharacter);
            return true;
        }
        return false;
    }

    public boolean deleteCharacter(String characterName){
        Character aCharacter = new Character(characterName);
        if(characters.contains(aCharacter)){
            characters.remove(aCharacter);
            return true;
        }
        return false;
    }
}
