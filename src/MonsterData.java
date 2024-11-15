import java.util.HashMap;
import java.util.Map;

public class MonsterData {

    public static Map<String, Monster> getMonsters() {
        Map<String, Monster> monsterMap = new HashMap<>();
        monsterMap.put("イガキン", new Monster("イガキン", 9));
        monsterMap.put("ナマチュウ", new Monster("ナマチュウ", 3));
        monsterMap.put("イノウエン", new Monster("イノウエン", 1));
        monsterMap.put("リョージィ", new Monster("リョージィ", 2));
        monsterMap.put("アキモトン", new Monster("アキモトン", 5));
        monsterMap.put("ゴージマ", new Monster("ゴージマ", 4));
        monsterMap.put("チュウデン", new Monster("チュウデン", 6));
        monsterMap.put("ヅカホン", new Monster("ヅカホン", 8));
        monsterMap.put("ニシムラー", new Monster("ニシムラー", 7));
        monsterMap.put("サコーデン", new Monster("サコーデン", 2));
        monsterMap.put("ウッチー", new Monster("ウッチー", 5));
        monsterMap.put("ハヤッシー", new Monster("ハヤッシー", 4));
        monsterMap.put("キーチー", new Monster("キーチー", 3));
        monsterMap.put("リョクン", new Monster("リョクン", 1));
        monsterMap.put("デコポン", new Monster("デコポン", 6));
        monsterMap.put("カミサン", new Monster("カミサン", 5));
        monsterMap.put("シスイ", new Monster("シスイ", 1));
        monsterMap.put("ジョナ", new Monster("ジョナ", 7));
        monsterMap.put("ギダギダ", new Monster("ギダギダ", 2));
        monsterMap.put("ミッツー", new Monster("ミッツー", 8));
        monsterMap.put("ゾエサン", new Monster("ゾエサン", 5));
        monsterMap.put("キタバー", new Monster("キタバー", 3));
        return monsterMap;
    }
}
