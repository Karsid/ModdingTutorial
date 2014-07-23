package com.karsid.modtutorial;

/**
  * Mod based on Pahimar's YouTube tutorial series:
  *    https://www.youtube.com/playlist?list=PLQPiZYWovwmnZlgvbHCbz6TefIgeEiVcj
 **/

/**
  * The metadata for colour is:
  *	    1		Orange
  *	    2		Magenta
  *	    3		Light Blue
  *	    4		Yellow
  *	    5		Lime
  *	    6		Pink
  *	    7		Gray
  *	    8		Light Gray
  *	    9		Cyan
  *	    10		Purple
  *	    11		Blue
  *	    12		Brown
  *	    13		Green
  *	    14		Red
  *	    15		Black
 **/

/**
  * To "pinch" assets from minecraft you need to open the following:
  *      %appdata%/.minecraft/versions/1.7.2/1.7.2.jar
  * and then traverse to:
  *      assets/minecraft/textures/blocks
  *      assets/minecraft/textures/items
  * etc.
  *
  * To add assets for your code you need to:
  *     - go into src/main/resources/assets/
  *     - create your TLDR directory e.g. modtutorial
  *     - under that you will need
  *     	- textures/blocks
  *     	- textures/items
  *
 **/

/**
  *  To get the latest version of forge:
  *      - update your build.gradle and change
  *          minecraft -> version
  *        to what version of forge you want
  *      - from the command prompt type
  *          gradlew clean
  *          gradlew setupDecompWorkspace
  *          gradlew idea
 **/

/**
 *  To get the latest version of gradle:
 *      - from the command prompt type
 *          gradlew clean --refresh-dependencies
 *          gradlew setupDecompWorkspace
 *          gradlew idea
 *      - make sure you DO NOT update forge at the same time
 *        otherwise you get the ASSETS_INDEX issue and
 *        need to do the forge update steps
 **/

/**
  * To package up the code you need to:
  *    - go to your forge/mcp directory
  *    - run the recompile.bat script
  *    - run the reobfuscate.bat script
  *    
  *    - go to your forge/mcp/reobf/minecraft directory
  *    - this will show you the TLDR for your mods
  *    - go into the tutorial directory
  *    - this will show the modtutorial directory
  *    - zip up this directory as modtutorial.zip and ship it :)
 **/

/**
  * For mob modelling use a tool like:
  *    Techne (http://techne.zeux.me/)
  *    MCModeler (http://caffeinix.github.io/mcmodeler/)
 **/

/**
  *  Minencraft commands helper:
  *     - /give ForgeCraftDev ModTutorial:xxx
  *     - /gamerule doDaylightCycle false
  *     - /time set 6000
 **/


import com.karsid.modtutorial.handler.ConfigurationHandler;
import com.karsid.modtutorial.init.ModBlocks;
import com.karsid.modtutorial.init.ModItems;
import com.karsid.modtutorial.init.Recipes;
import com.karsid.modtutorial.proxy.IProxy;
import com.karsid.modtutorial.reference.Reference;
import com.karsid.modtutorial.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ModTutorial {
    @Mod.Instance(Reference.MOD_ID)
    public static ModTutorial instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModBlocks.init();

        ModItems.init();

        LogHelper.info("Pre Initialisation Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Recipes.init();

        LogHelper.info("Initialisation Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialisation Complete!");

        for (String oreName : OreDictionary.getOreNames()) {
            LogHelper.info(oreName.toString());
        }
        OreDictionary.getOres("stickWood");
    }
}
