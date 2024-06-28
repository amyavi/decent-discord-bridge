package dev.optimistic.decentdiscordbridge.discord.impl

import com.mojang.authlib.GameProfile
import dev.optimistic.decentdiscordbridge.discord.AbstractBridge
import net.minecraft.network.message.SignedMessage
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.text.Text

object DisabledBridge : AbstractBridge {
    override fun generateAvatarUrl(profile: GameProfile): String = ""
    override fun sendSystem(message: Text) {}
    override fun sendPlayer(player: ServerPlayerEntity, message: SignedMessage) {}
    override fun shutdown() {}
}