package com.github.programandominecraft.bukkit.example;

import org.apache.commons.lang.Validate;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;

import java.util.List;
import java.util.Random;

public class HelloCommand implements CommandExecutor {
    private final ExamplePlugin plugin;
    private final Random random = new Random();
    HelloCommand(ExamplePlugin plugin, PluginCommand command) {
        Validate.notNull(plugin);
        this.plugin = plugin;
        command.setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        List<String> messages = plugin.getConfig().getStringList("hello-messages");
        sender.sendMessage(messages.get(random.nextInt(messages.size())));
        return false;
    }
}
