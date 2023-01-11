package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.dungeons.enums.DungeonEntrySatisfiedConditionType;
import emu.grasscutter.game.dungeons.enums.DungunEntryType;
import emu.grasscutter.game.quest.enums.LogicType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@ResourceType(name = "DungeonEntryExcelConfigData.json")
@Getter
@Setter  // TODO: remove this next API break
public class DungeonEntryData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private int dungeonEntryId;
    private int sceneId;
    private DungunEntryType type;
    private LogicType condComb;
    private List<SatisfiedCond> satisfiedCond;
    private int rewardDataId;
    private boolean isShowInAdvHandbook;
    private boolean isDailyRefresh;

    @Data
    public static class SatisfiedCond{
        DungeonEntrySatisfiedConditionType type;
        int param1;
    }
}
