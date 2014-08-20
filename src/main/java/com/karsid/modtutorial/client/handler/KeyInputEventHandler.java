package com.karsid.modtutorial.client.handler;

import com.karsid.modtutorial.client.settings.Keybindings;
import com.karsid.modtutorial.reference.Key;
import com.karsid.modtutorial.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
    private static Key getPressedKeybindings() {
        if (Keybindings.charge.isPressed()) {
            return Key.CHARGE;
        } else if (Keybindings.release.isPressed()) {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        LogHelper.info(getPressedKeybindings());
    }
}
