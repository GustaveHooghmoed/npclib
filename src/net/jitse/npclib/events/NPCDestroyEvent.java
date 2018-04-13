package net.jitse.npclib.events;

import net.jitse.npclib.api.NPC;
import net.jitse.npclib.events.trigger.TriggerType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NPCDestroyEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled = false;

    private final NPC npc;
    private final Player player;
    private final TriggerType trigger;

    public NPCDestroyEvent(NPC npc, Player player, TriggerType trigger) {
        this.npc = npc;
        this.player = player;
        this.trigger = trigger;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public NPC getNPC() {
        return npc;
    }

    public Player getPlayer() {
        return player;
    }

    public TriggerType getTrigger() {
        return trigger;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
