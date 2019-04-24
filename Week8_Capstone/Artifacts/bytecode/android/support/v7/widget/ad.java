class android.support.v7.widget.ad {
  static {};
    Code:
       0: new           #30                 // class android/graphics/RectF
       3: dup
       4: invokespecial #33                 // Method android/graphics/RectF."<init>":()V
       7: putstatic     #35                 // Field a:Landroid/graphics/RectF;
      10: new           #37                 // class java/util/concurrent/ConcurrentHashMap
      13: dup
      14: invokespecial #38                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
      17: putstatic     #40                 // Field b:Ljava/util/concurrent/ConcurrentHashMap;
      20: return

  android.support.v7.widget.ad(android.widget.TextView);
    Code:
       0: aload_0
       1: invokespecial #43                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #45                 // Field c:I
       9: aload_0
      10: iconst_0
      11: putfield      #47                 // Field d:Z
      14: aload_0
      15: ldc           #48                 // float -1.0f
      17: putfield      #50                 // Field e:F
      20: aload_0
      21: ldc           #48                 // float -1.0f
      23: putfield      #52                 // Field f:F
      26: aload_0
      27: ldc           #48                 // float -1.0f
      29: putfield      #54                 // Field g:F
      32: aload_0
      33: iconst_0
      34: newarray       int
      36: putfield      #56                 // Field h:[I
      39: aload_0
      40: iconst_0
      41: putfield      #58                 // Field i:Z
      44: aload_0
      45: aload_1
      46: putfield      #60                 // Field k:Landroid/widget/TextView;
      49: aload_0
      50: aload_0
      51: getfield      #60                 // Field k:Landroid/widget/TextView;
      54: invokevirtual #66                 // Method android/widget/TextView.getContext:()Landroid/content/Context;
      57: putfield      #68                 // Field l:Landroid/content/Context;
      60: return

  int a();
    Code:
       0: aload_0
       1: getfield      #45                 // Field c:I
       4: ireturn

  void a(int);
    Code:
       0: aload_0
       1: invokespecial #405                // Method k:()Z
       4: ifeq          114
       7: iload_1
       8: tableswitch   { // 0 to 1
                     0: 110
                     1: 66
               default: 32
          }
      32: new           #199                // class java/lang/StringBuilder
      35: dup
      36: invokespecial #200                // Method java/lang/StringBuilder."<init>":()V
      39: astore_2
      40: aload_2
      41: ldc_w         #410                // String Unknown auto-size text type:
      44: invokevirtual #206                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      47: pop
      48: aload_2
      49: iload_1
      50: invokevirtual #413                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      53: pop
      54: new           #285                // class java/lang/IllegalArgumentException
      57: dup
      58: aload_2
      59: invokevirtual #214                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      62: invokespecial #286                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      65: athrow
      66: aload_0
      67: getfield      #68                 // Field l:Landroid/content/Context;
      70: invokevirtual #419                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      73: invokevirtual #425                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      76: astore_2
      77: aload_0
      78: iconst_2
      79: ldc_w         #426                // float 12.0f
      82: aload_2
      83: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      86: iconst_2
      87: ldc_w         #433                // float 112.0f
      90: aload_2
      91: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      94: fconst_1
      95: invokespecial #435                // Method a:(FFF)V
      98: aload_0
      99: invokespecial #437                // Method i:()Z
     102: ifeq          114
     105: aload_0
     106: invokevirtual #439                // Method f:()V
     109: return
     110: aload_0
     111: invokespecial #441                // Method j:()V
     114: return

  void a(int, float);
    Code:
       0: aload_0
       1: getfield      #68                 // Field l:Landroid/content/Context;
       4: ifnonnull     14
       7: invokestatic  #445                // Method android/content/res/Resources.getSystem:()Landroid/content/res/Resources;
      10: astore_3
      11: goto          22
      14: aload_0
      15: getfield      #68                 // Field l:Landroid/content/Context;
      18: invokevirtual #419                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      21: astore_3
      22: aload_0
      23: iload_1
      24: fload_2
      25: aload_3
      26: invokevirtual #425                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      29: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      32: invokespecial #447                // Method a:(F)V
      35: return

  void a(int, int, int, int);
    Code:
       0: aload_0
       1: invokespecial #405                // Method k:()Z
       4: ifeq          61
       7: aload_0
       8: getfield      #68                 // Field l:Landroid/content/Context;
      11: invokevirtual #419                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      14: invokevirtual #425                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      17: astore        5
      19: aload_0
      20: iload         4
      22: iload_1
      23: i2f
      24: aload         5
      26: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      29: iload         4
      31: iload_2
      32: i2f
      33: aload         5
      35: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      38: iload         4
      40: iload_3
      41: i2f
      42: aload         5
      44: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      47: invokespecial #435                // Method a:(FFF)V
      50: aload_0
      51: invokespecial #437                // Method i:()Z
      54: ifeq          61
      57: aload_0
      58: invokevirtual #439                // Method f:()V
      61: return

  void a(android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: getfield      #68                 // Field l:Landroid/content/Context;
       4: aload_1
       5: getstatic     #454                // Field android/support/v7/a/a$j.AppCompatTextView:[I
       8: iload_2
       9: iconst_0
      10: invokevirtual #458                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      13: astore_1
      14: aload_1
      15: getstatic     #461                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeTextType:I
      18: invokevirtual #465                // Method android/content/res/TypedArray.hasValue:(I)Z
      21: ifeq          36
      24: aload_0
      25: aload_1
      26: getstatic     #461                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeTextType:I
      29: iconst_0
      30: invokevirtual #468                // Method android/content/res/TypedArray.getInt:(II)I
      33: putfield      #45                 // Field c:I
      36: aload_1
      37: getstatic     #471                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeStepGranularity:I
      40: invokevirtual #465                // Method android/content/res/TypedArray.hasValue:(I)Z
      43: ifeq          59
      46: aload_1
      47: getstatic     #471                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeStepGranularity:I
      50: ldc           #48                 // float -1.0f
      52: invokevirtual #475                // Method android/content/res/TypedArray.getDimension:(IF)F
      55: fstore_3
      56: goto          62
      59: ldc           #48                 // float -1.0f
      61: fstore_3
      62: aload_1
      63: getstatic     #478                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeMinTextSize:I
      66: invokevirtual #465                // Method android/content/res/TypedArray.hasValue:(I)Z
      69: ifeq          86
      72: aload_1
      73: getstatic     #478                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeMinTextSize:I
      76: ldc           #48                 // float -1.0f
      78: invokevirtual #475                // Method android/content/res/TypedArray.getDimension:(IF)F
      81: fstore        4
      83: goto          90
      86: ldc           #48                 // float -1.0f
      88: fstore        4
      90: aload_1
      91: getstatic     #481                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeMaxTextSize:I
      94: invokevirtual #465                // Method android/content/res/TypedArray.hasValue:(I)Z
      97: ifeq          114
     100: aload_1
     101: getstatic     #481                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizeMaxTextSize:I
     104: ldc           #48                 // float -1.0f
     106: invokevirtual #475                // Method android/content/res/TypedArray.getDimension:(IF)F
     109: fstore        5
     111: goto          118
     114: ldc           #48                 // float -1.0f
     116: fstore        5
     118: aload_1
     119: getstatic     #484                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizePresetSizes:I
     122: invokevirtual #465                // Method android/content/res/TypedArray.hasValue:(I)Z
     125: ifeq          162
     128: aload_1
     129: getstatic     #484                // Field android/support/v7/a/a$j.AppCompatTextView_autoSizePresetSizes:I
     132: iconst_0
     133: invokevirtual #487                // Method android/content/res/TypedArray.getResourceId:(II)I
     136: istore_2
     137: iload_2
     138: ifle          162
     141: aload_1
     142: invokevirtual #488                // Method android/content/res/TypedArray.getResources:()Landroid/content/res/Resources;
     145: iload_2
     146: invokevirtual #492                // Method android/content/res/Resources.obtainTypedArray:(I)Landroid/content/res/TypedArray;
     149: astore        7
     151: aload_0
     152: aload         7
     154: invokespecial #494                // Method a:(Landroid/content/res/TypedArray;)V
     157: aload         7
     159: invokevirtual #497                // Method android/content/res/TypedArray.recycle:()V
     162: aload_1
     163: invokevirtual #497                // Method android/content/res/TypedArray.recycle:()V
     166: aload_0
     167: invokespecial #405                // Method k:()Z
     170: ifeq          272
     173: aload_0
     174: getfield      #45                 // Field c:I
     177: iconst_1
     178: if_icmpne     277
     181: aload_0
     182: getfield      #58                 // Field i:Z
     185: ifne          266
     188: aload_0
     189: getfield      #68                 // Field l:Landroid/content/Context;
     192: invokevirtual #419                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
     195: invokevirtual #425                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
     198: astore_1
     199: fload         4
     201: fstore        6
     203: fload         4
     205: ldc           #48                 // float -1.0f
     207: fcmpl
     208: ifne          221
     211: iconst_2
     212: ldc_w         #426                // float 12.0f
     215: aload_1
     216: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
     219: fstore        6
     221: fload         5
     223: fstore        4
     225: fload         5
     227: ldc           #48                 // float -1.0f
     229: fcmpl
     230: ifne          243
     233: iconst_2
     234: ldc_w         #433                // float 112.0f
     237: aload_1
     238: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
     241: fstore        4
     243: fload_3
     244: fstore        5
     246: fload_3
     247: ldc           #48                 // float -1.0f
     249: fcmpl
     250: ifne          256
     253: fconst_1
     254: fstore        5
     256: aload_0
     257: fload         6
     259: fload         4
     261: fload         5
     263: invokespecial #435                // Method a:(FFF)V
     266: aload_0
     267: invokespecial #437                // Method i:()Z
     270: pop
     271: return
     272: aload_0
     273: iconst_0
     274: putfield      #45                 // Field c:I
     277: return

  void a(int[], int);
    Code:
       0: aload_0
       1: invokespecial #405                // Method k:()Z
       4: ifeq          159
       7: aload_1
       8: arraylength
       9: istore        4
      11: iconst_0
      12: istore_3
      13: iload         4
      15: ifle          143
      18: iload         4
      20: newarray       int
      22: astore        6
      24: iload_2
      25: ifne          39
      28: aload_1
      29: iload         4
      31: invokestatic  #502                // Method java/util/Arrays.copyOf:([II)[I
      34: astore        5
      36: goto          85
      39: aload_0
      40: getfield      #68                 // Field l:Landroid/content/Context;
      43: invokevirtual #419                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      46: invokevirtual #425                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      49: astore        7
      51: aload         6
      53: astore        5
      55: iload_3
      56: iload         4
      58: if_icmpge     85
      61: aload         6
      63: iload_3
      64: iload_2
      65: aload_1
      66: iload_3
      67: iaload
      68: i2f
      69: aload         7
      71: invokestatic  #432                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      74: invokestatic  #351                // Method java/lang/Math.round:(F)I
      77: iastore
      78: iload_3
      79: iconst_1
      80: iadd
      81: istore_3
      82: goto          51
      85: aload_0
      86: aload_0
      87: aload         5
      89: invokespecial #307                // Method a:([I)[I
      92: putfield      #56                 // Field h:[I
      95: aload_0
      96: invokespecial #309                // Method h:()Z
      99: ifne          148
     102: new           #199                // class java/lang/StringBuilder
     105: dup
     106: invokespecial #200                // Method java/lang/StringBuilder."<init>":()V
     109: astore        5
     111: aload         5
     113: ldc_w         #504                // String None of the preset sizes is valid:
     116: invokevirtual #206                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     119: pop
     120: aload         5
     122: aload_1
     123: invokestatic  #507                // Method java/util/Arrays.toString:([I)Ljava/lang/String;
     126: invokevirtual #206                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     129: pop
     130: new           #285                // class java/lang/IllegalArgumentException
     133: dup
     134: aload         5
     136: invokevirtual #214                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     139: invokespecial #286                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     142: athrow
     143: aload_0
     144: iconst_0
     145: putfield      #58                 // Field i:Z
     148: aload_0
     149: invokespecial #437                // Method i:()Z
     152: ifeq          159
     155: aload_0
     156: invokevirtual #439                // Method f:()V
     159: return

  int b();
    Code:
       0: aload_0
       1: getfield      #50                 // Field e:F
       4: invokestatic  #351                // Method java/lang/Math.round:(F)I
       7: ireturn

  int c();
    Code:
       0: aload_0
       1: getfield      #52                 // Field f:F
       4: invokestatic  #351                // Method java/lang/Math.round:(F)I
       7: ireturn

  int d();
    Code:
       0: aload_0
       1: getfield      #54                 // Field g:F
       4: invokestatic  #351                // Method java/lang/Math.round:(F)I
       7: ireturn

  int[] e();
    Code:
       0: aload_0
       1: getfield      #56                 // Field h:[I
       4: areturn

  void f();
    Code:
       0: aload_0
       1: invokevirtual #510                // Method g:()Z
       4: ifne          8
       7: return
       8: aload_0
       9: getfield      #47                 // Field d:Z
      12: ifeq          196
      15: aload_0
      16: getfield      #60                 // Field k:Landroid/widget/TextView;
      19: invokevirtual #513                // Method android/widget/TextView.getMeasuredHeight:()I
      22: ifle          195
      25: aload_0
      26: getfield      #60                 // Field k:Landroid/widget/TextView;
      29: invokevirtual #516                // Method android/widget/TextView.getMeasuredWidth:()I
      32: ifgt          36
      35: return
      36: aload_0
      37: aload_0
      38: getfield      #60                 // Field k:Landroid/widget/TextView;
      41: ldc_w         #518                // String getHorizontallyScrolling
      44: iconst_0
      45: invokestatic  #116                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      48: invokespecial #106                // Method a:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      51: checkcast     #113                // class java/lang/Boolean
      54: invokevirtual #119                // Method java/lang/Boolean.booleanValue:()Z
      57: ifeq          67
      60: ldc_w         #519                // int 1048576
      63: istore_2
      64: goto          91
      67: aload_0
      68: getfield      #60                 // Field k:Landroid/widget/TextView;
      71: invokevirtual #516                // Method android/widget/TextView.getMeasuredWidth:()I
      74: aload_0
      75: getfield      #60                 // Field k:Landroid/widget/TextView;
      78: invokevirtual #522                // Method android/widget/TextView.getTotalPaddingLeft:()I
      81: isub
      82: aload_0
      83: getfield      #60                 // Field k:Landroid/widget/TextView;
      86: invokevirtual #525                // Method android/widget/TextView.getTotalPaddingRight:()I
      89: isub
      90: istore_2
      91: aload_0
      92: getfield      #60                 // Field k:Landroid/widget/TextView;
      95: invokevirtual #526                // Method android/widget/TextView.getHeight:()I
      98: aload_0
      99: getfield      #60                 // Field k:Landroid/widget/TextView;
     102: invokevirtual #529                // Method android/widget/TextView.getCompoundPaddingBottom:()I
     105: isub
     106: aload_0
     107: getfield      #60                 // Field k:Landroid/widget/TextView;
     110: invokevirtual #532                // Method android/widget/TextView.getCompoundPaddingTop:()I
     113: isub
     114: istore_3
     115: iload_2
     116: ifle          195
     119: iload_3
     120: ifgt          124
     123: return
     124: getstatic     #35                 // Field a:Landroid/graphics/RectF;
     127: astore        4
     129: aload         4
     131: monitorenter
     132: getstatic     #35                 // Field a:Landroid/graphics/RectF;
     135: invokevirtual #535                // Method android/graphics/RectF.setEmpty:()V
     138: getstatic     #35                 // Field a:Landroid/graphics/RectF;
     141: iload_2
     142: i2f
     143: putfield      #345                // Field android/graphics/RectF.right:F
     146: getstatic     #35                 // Field a:Landroid/graphics/RectF;
     149: iload_3
     150: i2f
     151: putfield      #368                // Field android/graphics/RectF.bottom:F
     154: aload_0
     155: getstatic     #35                 // Field a:Landroid/graphics/RectF;
     158: invokespecial #537                // Method a:(Landroid/graphics/RectF;)I
     161: i2f
     162: fstore_1
     163: fload_1
     164: aload_0
     165: getfield      #60                 // Field k:Landroid/widget/TextView;
     168: invokevirtual #538                // Method android/widget/TextView.getTextSize:()F
     171: fcmpl
     172: ifeq          181
     175: aload_0
     176: iconst_0
     177: fload_1
     178: invokevirtual #540                // Method a:(IF)V
     181: aload         4
     183: monitorexit
     184: goto          196
     187: astore        5
     189: aload         4
     191: monitorexit
     192: aload         5
     194: athrow
     195: return
     196: aload_0
     197: iconst_1
     198: putfield      #47                 // Field d:Z
     201: return
    Exception table:
       from    to  target type
         132   181   187   any
         181   184   187   any
         189   192   187   any

  boolean g();
    Code:
       0: aload_0
       1: invokespecial #405                // Method k:()Z
       4: ifeq          16
       7: aload_0
       8: getfield      #45                 // Field c:I
      11: ifeq          16
      14: iconst_1
      15: ireturn
      16: iconst_0
      17: ireturn
}
