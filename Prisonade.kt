package me.mrenxo.prisonade


import me.mrenxo.prisonade.Events.onJoin
import me.mrenxo.utilase.Commands.bukkit.bCmd
import me.mrenxo.utilase.Commands.bukkit.register
import me.mrenxo.utilase.Commands.core.none
import me.mrenxo.utilase.Formating.Messager
import me.mrenxo.utilase.Formating.dashResolver
import me.mrenxo.utilase.Registrator
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import org.reflections.Reflections
import org.reflections.scanners.Scanners
import org.reflections.scanners.SubTypesScanner
import org.reflections.util.ConfigurationBuilder
import org.reflections.util.FilterBuilder


lateinit var messager: Messager;

class Prisonade : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic

        messager = Messager(this, dashResolver("dash"))

        Registrator.registerListener(onJoin(), this)

        bCmd("TestCommand") {

            permission = none()

            execute { sender, _, args ->
                messager.sendText(sender, "Hello!!!")
            }
        }.register(this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}