package com.undefinedcreation.remapper

import org.bukkit.Bukkit
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener {

    override fun onEnable() {

        Bukkit.getPluginManager().registerEvents(this, this)

        println(EntityType.entries.size)

    }

    override fun onDisable() {

    }

    @EventHandler
    fun onJoin(e: PlayerJoinEvent) {

    }

}