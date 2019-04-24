public abstract class com.github.paolorotolo.appintro.AppIntroBaseFragment extends android.support.v4.app.i implements com.github.paolorotolo.appintro.ISlideBackgroundColorHolder,com.github.paolorotolo.appintro.ISlideSelectionListener {
  protected static final java.lang.String ARG_BG_COLOR;

  protected static final java.lang.String ARG_DESC;

  protected static final java.lang.String ARG_DESC_COLOR;

  protected static final java.lang.String ARG_DESC_TYPEFACE;

  protected static final java.lang.String ARG_DRAWABLE;

  protected static final java.lang.String ARG_TITLE;

  protected static final java.lang.String ARG_TITLE_COLOR;

  protected static final java.lang.String ARG_TITLE_TYPEFACE;

  static {};
    Code:
       0: ldc           #2                  // class com/github/paolorotolo/appintro/AppIntroBaseFragment
       2: invokestatic  #52                 // Method com/github/paolorotolo/appintro/util/LogHelper.makeLogTag:(Ljava/lang/Class;)Ljava/lang/String;
       5: putstatic     #54                 // Field TAG:Ljava/lang/String;
       8: return

  public com.github.paolorotolo.appintro.AppIntroBaseFragment();
    Code:
       0: aload_0
       1: invokespecial #58                 // Method android/support/v4/app/i."<init>":()V
       4: return

  public int getDefaultBackgroundColor();
    Code:
       0: aload_0
       1: getfield      #62                 // Field bgColor:I
       4: ireturn

  protected abstract int getLayoutId();

  public void onActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #67                 // Method android/support/v4/app/i.onActivityCreated:(Landroid/os/Bundle;)V
       5: aload_1
       6: ifnull        89
       9: aload_0
      10: aload_1
      11: ldc           #24                 // String drawable
      13: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      16: putfield      #75                 // Field drawable:I
      19: aload_0
      20: aload_1
      21: ldc           #27                 // String title
      23: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      26: putfield      #81                 // Field title:Ljava/lang/String;
      29: aload_0
      30: aload_1
      31: ldc           #33                 // String title_typeface
      33: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      36: putfield      #83                 // Field titleTypeface:Ljava/lang/String;
      39: aload_0
      40: aload_1
      41: ldc           #15                 // String desc
      43: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      46: putfield      #85                 // Field description:Ljava/lang/String;
      49: aload_0
      50: aload_1
      51: ldc           #21                 // String desc_typeface
      53: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      56: putfield      #87                 // Field descTypeface:Ljava/lang/String;
      59: aload_0
      60: aload_1
      61: ldc           #12                 // String bg_color
      63: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      66: putfield      #62                 // Field bgColor:I
      69: aload_0
      70: aload_1
      71: ldc           #30                 // String title_color
      73: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      76: putfield      #89                 // Field titleColor:I
      79: aload_0
      80: aload_1
      81: ldc           #18                 // String desc_color
      83: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      86: putfield      #91                 // Field descColor:I
      89: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #94                 // Method android/support/v4/app/i.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: iconst_1
       7: invokevirtual #98                 // Method setRetainInstance:(Z)V
      10: aload_0
      11: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
      14: ifnull        212
      17: aload_0
      18: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
      21: invokevirtual #105                // Method android/os/Bundle.size:()I
      24: ifeq          212
      27: aload_0
      28: aload_0
      29: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
      32: ldc           #24                 // String drawable
      34: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      37: putfield      #75                 // Field drawable:I
      40: aload_0
      41: aload_0
      42: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
      45: ldc           #27                 // String title
      47: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      50: putfield      #81                 // Field title:Ljava/lang/String;
      53: aload_0
      54: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
      57: ldc           #33                 // String title_typeface
      59: invokevirtual #109                // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
      62: ifeq          78
      65: aload_0
      66: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
      69: ldc           #33                 // String title_typeface
      71: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      74: astore_1
      75: goto          81
      78: ldc           #111                // String
      80: astore_1
      81: aload_0
      82: aload_1
      83: putfield      #83                 // Field titleTypeface:Ljava/lang/String;
      86: aload_0
      87: aload_0
      88: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
      91: ldc           #15                 // String desc
      93: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      96: putfield      #85                 // Field description:Ljava/lang/String;
      99: aload_0
     100: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
     103: ldc           #21                 // String desc_typeface
     105: invokevirtual #109                // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
     108: ifeq          124
     111: aload_0
     112: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
     115: ldc           #21                 // String desc_typeface
     117: invokevirtual #79                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
     120: astore_1
     121: goto          127
     124: ldc           #111                // String
     126: astore_1
     127: aload_0
     128: aload_1
     129: putfield      #87                 // Field descTypeface:Ljava/lang/String;
     132: aload_0
     133: aload_0
     134: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
     137: ldc           #12                 // String bg_color
     139: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
     142: putfield      #62                 // Field bgColor:I
     145: aload_0
     146: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
     149: ldc           #30                 // String title_color
     151: invokevirtual #109                // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
     154: istore        4
     156: iconst_0
     157: istore_3
     158: iload         4
     160: ifeq          176
     163: aload_0
     164: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
     167: ldc           #30                 // String title_color
     169: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
     172: istore_2
     173: goto          178
     176: iconst_0
     177: istore_2
     178: aload_0
     179: iload_2
     180: putfield      #89                 // Field titleColor:I
     183: iload_3
     184: istore_2
     185: aload_0
     186: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
     189: ldc           #18                 // String desc_color
     191: invokevirtual #109                // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
     194: ifeq          207
     197: aload_0
     198: invokevirtual #102                // Method getArguments:()Landroid/os/Bundle;
     201: ldc           #18                 // String desc_color
     203: invokevirtual #73                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
     206: istore_2
     207: aload_0
     208: iload_2
     209: putfield      #91                 // Field descColor:I
     212: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: aload_0
       2: invokevirtual #115                // Method getLayoutId:()I
       5: aload_2
       6: iconst_0
       7: invokevirtual #121                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      10: astore_1
      11: aload_1
      12: getstatic     #125                // Field com/github/paolorotolo/appintro/R$id.title:I
      15: invokevirtual #131                // Method android/view/View.findViewById:(I)Landroid/view/View;
      18: checkcast     #133                // class android/widget/TextView
      21: astore_2
      22: aload_1
      23: getstatic     #135                // Field com/github/paolorotolo/appintro/R$id.description:I
      26: invokevirtual #131                // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #133                // class android/widget/TextView
      32: astore_3
      33: aload_1
      34: getstatic     #138                // Field com/github/paolorotolo/appintro/R$id.image:I
      37: invokevirtual #131                // Method android/view/View.findViewById:(I)Landroid/view/View;
      40: checkcast     #140                // class android/widget/ImageView
      43: astore        4
      45: aload_0
      46: aload_1
      47: getstatic     #143                // Field com/github/paolorotolo/appintro/R$id.main:I
      50: invokevirtual #131                // Method android/view/View.findViewById:(I)Landroid/view/View;
      53: checkcast     #145                // class android/widget/LinearLayout
      56: putfield      #147                // Field mainLayout:Landroid/widget/LinearLayout;
      59: aload_2
      60: aload_0
      61: getfield      #81                 // Field title:Ljava/lang/String;
      64: invokevirtual #151                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      67: aload_0
      68: getfield      #89                 // Field titleColor:I
      71: ifeq          82
      74: aload_2
      75: aload_0
      76: getfield      #89                 // Field titleColor:I
      79: invokevirtual #155                // Method android/widget/TextView.setTextColor:(I)V
      82: aload_0
      83: getfield      #83                 // Field titleTypeface:Ljava/lang/String;
      86: ifnull        118
      89: aload_0
      90: getfield      #83                 // Field titleTypeface:Ljava/lang/String;
      93: aload_0
      94: invokevirtual #159                // Method getContext:()Landroid/content/Context;
      97: invokestatic  #165                // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
     100: ifnull        118
     103: aload_2
     104: aload_0
     105: getfield      #83                 // Field titleTypeface:Ljava/lang/String;
     108: aload_0
     109: invokevirtual #159                // Method getContext:()Landroid/content/Context;
     112: invokestatic  #165                // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
     115: invokevirtual #169                // Method android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
     118: aload_3
     119: aload_0
     120: getfield      #85                 // Field description:Ljava/lang/String;
     123: invokevirtual #151                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     126: aload_0
     127: getfield      #91                 // Field descColor:I
     130: ifeq          141
     133: aload_3
     134: aload_0
     135: getfield      #91                 // Field descColor:I
     138: invokevirtual #155                // Method android/widget/TextView.setTextColor:(I)V
     141: aload_0
     142: getfield      #87                 // Field descTypeface:Ljava/lang/String;
     145: ifnull        177
     148: aload_0
     149: getfield      #87                 // Field descTypeface:Ljava/lang/String;
     152: aload_0
     153: invokevirtual #159                // Method getContext:()Landroid/content/Context;
     156: invokestatic  #165                // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
     159: ifnull        177
     162: aload_3
     163: aload_0
     164: getfield      #87                 // Field descTypeface:Ljava/lang/String;
     167: aload_0
     168: invokevirtual #159                // Method getContext:()Landroid/content/Context;
     171: invokestatic  #165                // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
     174: invokevirtual #169                // Method android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
     177: aload         4
     179: aload_0
     180: getfield      #75                 // Field drawable:I
     183: invokevirtual #172                // Method android/widget/ImageView.setImageResource:(I)V
     186: aload_0
     187: getfield      #147                // Field mainLayout:Landroid/widget/LinearLayout;
     190: aload_0
     191: getfield      #62                 // Field bgColor:I
     194: invokevirtual #175                // Method android/widget/LinearLayout.setBackgroundColor:(I)V
     197: aload_1
     198: areturn

  public void onSaveInstanceState(android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #24                 // String drawable
       3: aload_0
       4: getfield      #75                 // Field drawable:I
       7: invokevirtual #180                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      10: aload_1
      11: ldc           #27                 // String title
      13: aload_0
      14: getfield      #81                 // Field title:Ljava/lang/String;
      17: invokevirtual #184                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      20: aload_1
      21: ldc           #15                 // String desc
      23: aload_0
      24: getfield      #85                 // Field description:Ljava/lang/String;
      27: invokevirtual #184                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      30: aload_1
      31: ldc           #12                 // String bg_color
      33: aload_0
      34: getfield      #62                 // Field bgColor:I
      37: invokevirtual #180                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      40: aload_1
      41: ldc           #30                 // String title_color
      43: aload_0
      44: getfield      #89                 // Field titleColor:I
      47: invokevirtual #180                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      50: aload_1
      51: ldc           #18                 // String desc_color
      53: aload_0
      54: getfield      #91                 // Field descColor:I
      57: invokevirtual #180                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      60: aload_0
      61: aload_1
      62: invokespecial #186                // Method android/support/v4/app/i.onSaveInstanceState:(Landroid/os/Bundle;)V
      65: return

  public void onSlideDeselected();
    Code:
       0: getstatic     #54                 // Field TAG:Ljava/lang/String;
       3: iconst_1
       4: anewarray     #189                // class java/lang/Object
       7: dup
       8: iconst_0
       9: ldc           #191                // String Slide %s has been deselected.
      11: iconst_1
      12: anewarray     #189                // class java/lang/Object
      15: dup
      16: iconst_0
      17: aload_0
      18: getfield      #81                 // Field title:Ljava/lang/String;
      21: aastore
      22: invokestatic  #197                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      25: aastore
      26: invokestatic  #201                // Method com/github/paolorotolo/appintro/util/LogHelper.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      29: return

  public void onSlideSelected();
    Code:
       0: getstatic     #54                 // Field TAG:Ljava/lang/String;
       3: iconst_1
       4: anewarray     #189                // class java/lang/Object
       7: dup
       8: iconst_0
       9: ldc           #204                // String Slide %s has been selected.
      11: iconst_1
      12: anewarray     #189                // class java/lang/Object
      15: dup
      16: iconst_0
      17: aload_0
      18: getfield      #81                 // Field title:Ljava/lang/String;
      21: aastore
      22: invokestatic  #197                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      25: aastore
      26: invokestatic  #201                // Method com/github/paolorotolo/appintro/util/LogHelper.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      29: return

  public void setBackgroundColor(int);
    Code:
       0: aload_0
       1: getfield      #147                // Field mainLayout:Landroid/widget/LinearLayout;
       4: iload_1
       5: invokevirtual #175                // Method android/widget/LinearLayout.setBackgroundColor:(I)V
       8: return
}
