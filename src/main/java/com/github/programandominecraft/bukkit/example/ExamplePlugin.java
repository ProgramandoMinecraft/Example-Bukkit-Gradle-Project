package com.github.programandominecraft.bukkit.example;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.BiConsumer;

public class ExamplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        configureCommand("hello", HelloCommand::new);
    }

    private void configureCommand(String name, BiConsumer<ExamplePlugin, PluginCommand> configurator) {
        PluginCommand pluginCommand = getServer().getPluginCommand(name);
        if (pluginCommand == null) {
            return;
        }
        configurator.accept(this, pluginCommand);
    }
}
