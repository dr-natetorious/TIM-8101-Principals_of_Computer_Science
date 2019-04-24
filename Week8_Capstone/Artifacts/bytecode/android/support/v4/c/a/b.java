public interface android.support.v4.c.a.b extends android.view.MenuItem {
  public abstract android.support.v4.c.a.b a(android.support.v4.view.c);

  public abstract android.support.v4.c.a.b a(java.lang.CharSequence);

  public abstract android.support.v4.view.c a();

  public abstract android.support.v4.c.a.b b(java.lang.CharSequence);

  public abstract boolean collapseActionView();

  public abstract boolean expandActionView();

  public abstract android.view.View getActionView();

  public abstract int getAlphabeticModifiers();

  public abstract java.lang.CharSequence getContentDescription();

  public abstract android.content.res.ColorStateList getIconTintList();

  public abstract android.graphics.PorterDuff$Mode getIconTintMode();

  public abstract int getNumericModifiers();

  public abstract java.lang.CharSequence getTooltipText();

  public abstract boolean isActionViewExpanded();

  public abstract android.view.MenuItem setActionView(int);

  public abstract android.view.MenuItem setActionView(android.view.View);

  public abstract android.view.MenuItem setAlphabeticShortcut(char, int);

  public abstract android.view.MenuItem setIconTintList(android.content.res.ColorStateList);

  public abstract android.view.MenuItem setIconTintMode(android.graphics.PorterDuff$Mode);

  public abstract android.view.MenuItem setNumericShortcut(char, int);

  public abstract android.view.MenuItem setShortcut(char, char, int, int);

  public abstract void setShowAsAction(int);

  public abstract android.view.MenuItem setShowAsActionFlags(int);
}
