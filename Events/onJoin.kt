package me.mrenxo.prisonade.Events

import me.mrenxo.prisonade.messager
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class onJoin : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        messager.sendText(event.player, "HII!!!! :3 X3")
    }
}