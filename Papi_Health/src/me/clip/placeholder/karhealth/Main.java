package me.clip.placeholder.karhealth;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Main extends PlaceholderExpansion
{
  public boolean canRegister()
  {
    return true;
  }

  public String getAuthor()
  {
    return "LSeng";
  }

  public String getIdentifier()
  {
    return "KarAPI";
  }

  public String getPlugin()
  {
    return "Placeholder";
  }

  public String getVersion()
  {
    return "1.0.0";
  }

  public String onPlaceholderRequest(Player p, String identifier)
  {
    if (p == null) {
      return "";
    }

    if(identifier.equals("health")){
         java.math.BigDecimal b = new java.math.BigDecimal(p.getHealth());  
        return b.setScale(1, java.math.BigDecimal.ROUND_HALF_UP).doubleValue()+"";  
    }
    return null;
    
  }
    
}