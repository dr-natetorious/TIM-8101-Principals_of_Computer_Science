public class android.support.c.a.c extends android.support.c.a.h implements android.support.c.a.b {
  final android.graphics.drawable.Drawable$Callback a;

  android.support.c.a.c();
    Code:
       0: aload_0
       1: aconst_null
       2: aconst_null
       3: aconst_null
       4: invokespecial #31                 // Method "<init>":(Landroid/content/Context;Landroid/support/c/a/c$a;Landroid/content/res/Resources;)V
       7: return

  public static android.support.c.a.c a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme);
    Code:
       0: new           #2                  // class android/support/c/a/c
       3: dup
       4: aload_0
       5: invokespecial #56                 // Method "<init>":(Landroid/content/Context;)V
       8: astore_0
       9: aload_0
      10: aload_1
      11: aload_2
      12: aload_3
      13: aload         4
      15: invokevirtual #60                 // Method inflate:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
      18: aload_0
      19: areturn

  public void applyTheme(android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #155                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V
      15: return

  public boolean canApplyTheme();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #160                // Method android/support/v4/b/a/a.d:(Landroid/graphics/drawable/Drawable;)Z
      14: ireturn
      15: iconst_0
      16: ireturn

  public void clearColorFilter();
    Code:
       0: aload_0
       1: invokespecial #163                // Method android/support/c/a/h.clearColorFilter:()V
       4: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #169                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: aload_1
      24: invokevirtual #170                // Method android/support/c/a/i.draw:(Landroid/graphics/Canvas;)V
      27: aload_0
      28: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      31: getfield      #173                // Field android/support/c/a/c$a.c:Landroid/animation/AnimatorSet;
      34: invokevirtual #176                // Method android/animation/AnimatorSet.isStarted:()Z
      37: ifeq          44
      40: aload_0
      41: invokevirtual #179                // Method invalidateSelf:()V
      44: return

  public int getAlpha();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #183                // Method android/support/v4/b/a/a.c:(Landroid/graphics/drawable/Drawable;)I
      14: ireturn
      15: aload_0
      16: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      19: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      22: invokevirtual #185                // Method android/support/c/a/i.getAlpha:()I
      25: ireturn

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #188                // Method android/graphics/drawable/Drawable.getChangingConfigurations:()I
      14: ireturn
      15: aload_0
      16: invokespecial #189                // Method android/support/c/a/h.getChangingConfigurations:()I
      19: aload_0
      20: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      23: getfield      #191                // Field android/support/c/a/c$a.a:I
      26: ior
      27: ireturn

  public android.graphics.ColorFilter getColorFilter();
    Code:
       0: aload_0
       1: invokespecial #195                // Method android/support/c/a/h.getColorFilter:()Landroid/graphics/ColorFilter;
       4: areturn

  public android.graphics.drawable.Drawable$ConstantState getConstantState();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        30
       7: getstatic     #123                // Field android/os/Build$VERSION.SDK_INT:I
      10: bipush        24
      12: if_icmplt     30
      15: new           #13                 // class android/support/c/a/c$b
      18: dup
      19: aload_0
      20: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      23: invokevirtual #199                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      26: invokespecial #202                // Method android/support/c/a/c$b."<init>":(Landroid/graphics/drawable/Drawable$ConstantState;)V
      29: areturn
      30: aconst_null
      31: areturn

  public android.graphics.drawable.Drawable getCurrent();
    Code:
       0: aload_0
       1: invokespecial #206                // Method android/support/c/a/h.getCurrent:()Landroid/graphics/drawable/Drawable;
       4: areturn

  public int getIntrinsicHeight();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #209                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
      14: ireturn
      15: aload_0
      16: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      19: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      22: invokevirtual #210                // Method android/support/c/a/i.getIntrinsicHeight:()I
      25: ireturn

  public int getIntrinsicWidth();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #213                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
      14: ireturn
      15: aload_0
      16: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      19: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      22: invokevirtual #214                // Method android/support/c/a/i.getIntrinsicWidth:()I
      25: ireturn

  public int getMinimumHeight();
    Code:
       0: aload_0
       1: invokespecial #217                // Method android/support/c/a/h.getMinimumHeight:()I
       4: ireturn

  public int getMinimumWidth();
    Code:
       0: aload_0
       1: invokespecial #220                // Method android/support/c/a/h.getMinimumWidth:()I
       4: ireturn

  public int getOpacity();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #223                // Method android/graphics/drawable/Drawable.getOpacity:()I
      14: ireturn
      15: aload_0
      16: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      19: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      22: invokevirtual #224                // Method android/support/c/a/i.getOpacity:()I
      25: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #228                // Method android/support/c/a/h.getPadding:(Landroid/graphics/Rect;)Z
       5: ireturn

  public int[] getState();
    Code:
       0: aload_0
       1: invokespecial #232                // Method android/support/c/a/h.getState:()[I
       4: areturn

  public android.graphics.Region getTransparentRegion();
    Code:
       0: aload_0
       1: invokespecial #236                // Method android/support/c/a/h.getTransparentRegion:()Landroid/graphics/Region;
       4: areturn

  public void inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aconst_null
       5: invokevirtual #60                 // Method inflate:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
       8: return

  public void inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        20
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: aload_2
      13: aload_3
      14: aload         4
      16: invokestatic  #240                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
      19: return
      20: aload_2
      21: invokeinterface #245,  1          // InterfaceMethod org/xmlpull/v1/XmlPullParser.getEventType:()I
      26: istore        5
      28: aload_2
      29: invokeinterface #248,  1          // InterfaceMethod org/xmlpull/v1/XmlPullParser.getDepth:()I
      34: istore        6
      36: iload         5
      38: iconst_1
      39: if_icmpeq     285
      42: aload_2
      43: invokeinterface #248,  1          // InterfaceMethod org/xmlpull/v1/XmlPullParser.getDepth:()I
      48: iload         6
      50: iconst_1
      51: iadd
      52: if_icmpge     61
      55: iload         5
      57: iconst_3
      58: if_icmpeq     285
      61: iload         5
      63: iconst_2
      64: if_icmpne     274
      67: aload_2
      68: invokeinterface #251,  1          // InterfaceMethod org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
      73: astore        7
      75: ldc           #253                // String animated-vector
      77: aload         7
      79: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      82: ifeq          182
      85: aload_1
      86: aload         4
      88: aload_3
      89: getstatic     #258                // Field android/support/c/a/a.e:[I
      92: invokestatic  #263                // Method android/support/v4/a/a/c.a:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      95: astore        8
      97: aload         8
      99: iconst_0
     100: iconst_0
     101: invokevirtual #269                // Method android/content/res/TypedArray.getResourceId:(II)I
     104: istore        5
     106: aload         8
     108: astore        7
     110: iload         5
     112: ifeq          174
     115: aload_1
     116: iload         5
     118: aload         4
     120: invokestatic  #272                // Method android/support/c/a/i.a:(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/support/c/a/i;
     123: astore        7
     125: aload         7
     127: iconst_0
     128: invokevirtual #275                // Method android/support/c/a/i.a:(Z)V
     131: aload         7
     133: aload_0
     134: getfield      #46                 // Field a:Landroid/graphics/drawable/Drawable$Callback;
     137: invokevirtual #279                // Method android/support/c/a/i.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
     140: aload_0
     141: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
     144: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
     147: ifnull        161
     150: aload_0
     151: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
     154: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
     157: aconst_null
     158: invokevirtual #279                // Method android/support/c/a/i.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
     161: aload_0
     162: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
     165: aload         7
     167: putfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
     170: aload         8
     172: astore        7
     174: aload         7
     176: invokevirtual #282                // Method android/content/res/TypedArray.recycle:()V
     179: goto          274
     182: ldc_w         #284                // String target
     185: aload         7
     187: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     190: ifeq          274
     193: aload_1
     194: aload_3
     195: getstatic     #286                // Field android/support/c/a/a.f:[I
     198: invokevirtual #292                // Method android/content/res/Resources.obtainAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
     201: astore        8
     203: aload         8
     205: iconst_0
     206: invokevirtual #296                // Method android/content/res/TypedArray.getString:(I)Ljava/lang/String;
     209: astore        9
     211: aload         8
     213: iconst_1
     214: iconst_0
     215: invokevirtual #269                // Method android/content/res/TypedArray.getResourceId:(II)I
     218: istore        5
     220: aload         8
     222: astore        7
     224: iload         5
     226: ifeq          174
     229: aload_0
     230: getfield      #48                 // Field d:Landroid/content/Context;
     233: ifnull        258
     236: aload_0
     237: aload         9
     239: aload_0
     240: getfield      #48                 // Field d:Landroid/content/Context;
     243: iload         5
     245: invokestatic  #301                // Method android/support/c/a/e.a:(Landroid/content/Context;I)Landroid/animation/Animator;
     248: invokespecial #303                // Method a:(Ljava/lang/String;Landroid/animation/Animator;)V
     251: aload         8
     253: astore        7
     255: goto          174
     258: aload         8
     260: invokevirtual #282                // Method android/content/res/TypedArray.recycle:()V
     263: new           #305                // class java/lang/IllegalStateException
     266: dup
     267: ldc_w         #307                // String Context can't be null when inflating animators
     270: invokespecial #310                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     273: athrow
     274: aload_2
     275: invokeinterface #313,  1          // InterfaceMethod org/xmlpull/v1/XmlPullParser.next:()I
     280: istore        5
     282: goto          36
     285: aload_0
     286: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
     289: invokevirtual #315                // Method android/support/c/a/c$a.a:()V
     292: return

  public boolean isAutoMirrored();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #318                // Method android/support/v4/b/a/a.b:(Landroid/graphics/drawable/Drawable;)Z
      14: ireturn
      15: aload_0
      16: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      19: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      22: invokevirtual #320                // Method android/support/c/a/i.isAutoMirrored:()Z
      25: ireturn

  public boolean isRunning();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        18
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: checkcast     #323                // class android/graphics/drawable/AnimatedVectorDrawable
      14: invokevirtual #325                // Method android/graphics/drawable/AnimatedVectorDrawable.isRunning:()Z
      17: ireturn
      18: aload_0
      19: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      22: getfield      #173                // Field android/support/c/a/c$a.c:Landroid/animation/AnimatorSet;
      25: invokevirtual #326                // Method android/animation/AnimatorSet.isRunning:()Z
      28: ireturn

  public boolean isStateful();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #329                // Method android/graphics/drawable/Drawable.isStateful:()Z
      14: ireturn
      15: aload_0
      16: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      19: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      22: invokevirtual #330                // Method android/support/c/a/i.isStateful:()Z
      25: ireturn

  public void jumpToCurrentState();
    Code:
       0: aload_0
       1: invokespecial #333                // Method android/support/c/a/h.jumpToCurrentState:()V
       4: return

  public android.graphics.drawable.Drawable mutate();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #336                // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      14: pop
      15: aload_0
      16: areturn

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #341                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: aload_1
      24: invokevirtual #342                // Method android/support/c/a/i.setBounds:(Landroid/graphics/Rect;)V
      27: return

  protected boolean onLevelChange(int);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokevirtual #347                // Method android/graphics/drawable/Drawable.setLevel:(I)Z
      15: ireturn
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: iload_1
      24: invokevirtual #348                // Method android/support/c/a/i.setLevel:(I)Z
      27: ireturn

  protected boolean onStateChange(int[]);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #353                // Method android/graphics/drawable/Drawable.setState:([I)Z
      15: ireturn
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: aload_1
      24: invokevirtual #354                // Method android/support/c/a/i.setState:([I)Z
      27: ireturn

  public void setAlpha(int);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokevirtual #358                // Method android/graphics/drawable/Drawable.setAlpha:(I)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: iload_1
      24: invokevirtual #359                // Method android/support/c/a/i.setAlpha:(I)V
      27: return

  public void setAutoMirrored(boolean);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokestatic  #363                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Z)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: iload_1
      24: invokevirtual #365                // Method android/support/c/a/i.setAutoMirrored:(Z)V
      27: return

  public void setChangingConfigurations(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #368                // Method android/support/c/a/h.setChangingConfigurations:(I)V
       5: return

  public void setColorFilter(int, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokespecial #372                // Method android/support/c/a/h.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
       6: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #375                // Method android/graphics/drawable/Drawable.setColorFilter:(Landroid/graphics/ColorFilter;)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: aload_1
      24: invokevirtual #376                // Method android/support/c/a/i.setColorFilter:(Landroid/graphics/ColorFilter;)V
      27: return

  public void setFilterBitmap(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #379                // Method android/support/c/a/h.setFilterBitmap:(Z)V
       5: return

  public void setHotspot(float, float);
    Code:
       0: aload_0
       1: fload_1
       2: fload_2
       3: invokespecial #383                // Method android/support/c/a/h.setHotspot:(FF)V
       6: return

  public void setHotspotBounds(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #387                // Method android/support/c/a/h.setHotspotBounds:(IIII)V
       9: return

  public boolean setState(int[]);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #388                // Method android/support/c/a/h.setState:([I)Z
       5: ireturn

  public void setTint(int);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokestatic  #392                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;I)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: iload_1
      24: invokevirtual #394                // Method android/support/c/a/i.setTint:(I)V
      27: return

  public void setTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #399                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: aload_1
      24: invokevirtual #401                // Method android/support/c/a/i.setTintList:(Landroid/content/res/ColorStateList;)V
      27: return

  public void setTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #406                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
      15: return
      16: aload_0
      17: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      20: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      23: aload_1
      24: invokevirtual #408                // Method android/support/c/a/i.setTintMode:(Landroid/graphics/PorterDuff$Mode;)V
      27: return

  public boolean setVisible(boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        17
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: iload_2
      13: invokevirtual #412                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
      16: ireturn
      17: aload_0
      18: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      21: getfield      #108                // Field android/support/c/a/c$a.b:Landroid/support/c/a/i;
      24: iload_1
      25: iload_2
      26: invokevirtual #413                // Method android/support/c/a/i.setVisible:(ZZ)Z
      29: pop
      30: aload_0
      31: iload_1
      32: iload_2
      33: invokespecial #414                // Method android/support/c/a/h.setVisible:(ZZ)Z
      36: ireturn

  public void start();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        18
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: checkcast     #323                // class android/graphics/drawable/AnimatedVectorDrawable
      14: invokevirtual #417                // Method android/graphics/drawable/AnimatedVectorDrawable.start:()V
      17: return
      18: aload_0
      19: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      22: getfield      #173                // Field android/support/c/a/c$a.c:Landroid/animation/AnimatorSet;
      25: invokevirtual #176                // Method android/animation/AnimatorSet.isStarted:()Z
      28: ifeq          32
      31: return
      32: aload_0
      33: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      36: getfield      #173                // Field android/support/c/a/c$a.c:Landroid/animation/AnimatorSet;
      39: invokevirtual #418                // Method android/animation/AnimatorSet.start:()V
      42: aload_0
      43: invokevirtual #179                // Method invalidateSelf:()V
      46: return

  public void stop();
    Code:
       0: aload_0
       1: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        18
       7: aload_0
       8: getfield      #150                // Field b:Landroid/graphics/drawable/Drawable;
      11: checkcast     #323                // class android/graphics/drawable/AnimatedVectorDrawable
      14: invokevirtual #421                // Method android/graphics/drawable/AnimatedVectorDrawable.stop:()V
      17: return
      18: aload_0
      19: getfield      #50                 // Field c:Landroid/support/c/a/c$a;
      22: getfield      #173                // Field android/support/c/a/c$a.c:Landroid/animation/AnimatorSet;
      25: invokevirtual #424                // Method android/animation/AnimatorSet.end:()V
      28: return
}
