package com.nylostats;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("nylostats")
public interface NyloStatsConfig extends Config
{
    @ConfigItem(
            position =  0,
            keyName = "showTotalStalls",
            name = "Total stalls",
            description = "Displays total number of times the nylocas waves have stalled."
    )
    default boolean showTotalStalls()
    {
        return true;
    }

    @ConfigItem(
            position = 1,
            keyName = "showStalls",
            name = "All stalls",
            description = "Displays all stalls individually per wave."
    )
    default StallDisplays showStalls()
    {
        return StallDisplays.OFF;
    }

    @ConfigItem(
            position = 2,
            keyName = "smallSplits",
            name = "Small splits",
            description = "Shows the amount of nylocas that have spawned from bigs."
    )
    default boolean showSplits()
    {
        return true;
    }

    @ConfigItem(
            position = 3,
            keyName = "smallSplitsCap",
            name = "Small splits post/pre cap",
            description = "Shows the amount of nylocas that spawned pre/post cap (Only works if small splits is enabled)"
    )
    default boolean showSplitsCap() { return false; }

    @ConfigItem(
            position = 3,
            keyName = "bossRotation",
            name = "Boss rotation",
            description = "Shows the amount of phases the nylocas boss had."
    )
    default boolean showBossRotation() { return true; }
}
