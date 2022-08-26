package io.github.terslenk.exlimus.utils;

import io.github.terslenk.exlimus.ExLimus;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

@UtilityClass
public class EXRecipeTypes {
    public static final RecipeType HAMMER_BREAK = new RecipeType(new NamespacedKey(ExLimus.getAddon(), "el_hammer_break"), new CustomItemStack(Material.DIAMOND_PICKAXE,"&6用石锤挖地","","&7项目可以通过打破特定区块来收集"));
    public static final RecipeType KAMA_BREAK = new RecipeType(new NamespacedKey(ExLimus.getAddon(), "el_kama_break"),new CustomItemStack(Material.WOODEN_HOE,"&6用木卡马收割","","&7可以通过破坏特定区块来收获物品"));
    public static final RecipeType GRINDER = new RecipeType(new NamespacedKey(ExLimus.getAddon(), "el_grinder"),new CustomItemStack(Material.GRINDSTONE,"&7使用研磨机制作","","&7该项目可以通过在研磨机中研磨特定的块来制作"));
}
