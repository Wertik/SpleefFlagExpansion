package space.devport.wertik.spleefflagexpansion;

import space.devport.utils.text.language.LanguageDefaults;

public class SpleefFlagLanguage extends LanguageDefaults {

    @Override
    public void setDefaults() {
        addDefault("Commands.Reset.Invalid-World", "&cWorld &f%param% &cis invalid.");
        addDefault("Commands.Reset.Done", "&7Reset &f%count% &7regeneration tasks.");
        addDefault("Commands.Reset.Done-World", "&7Reset &f%count% &7regeneration tasks in world &f%world%");
    }
}