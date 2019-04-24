public abstract class ryey.easer.core.ui.data.b<T extends ryey.easer.core.a.f & ryey.easer.core.a.l & ryey.easer.core.a.m, T_storage extends ryey.easer.core.a.a.a<T, ?>> extends android.support.v7.app.e {
  protected static java.lang.String a;

  T_storage b;

  ryey.easer.core.ui.data.g$a c;

  protected java.lang.String d;

  static {};
    Code:
       0: return

  public ryey.easer.core.ui.data.b();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method android/support/v7/app/e."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #31                 // Field b:Lryey/easer/core/a/a/a;
       9: aload_0
      10: aconst_null
      11: putfield      #33                 // Field d:Ljava/lang/String;
      14: return

  protected abstract T_storage a();

  protected abstract void a(T);

  protected abstract java.lang.String b();

  protected abstract int c();

  protected abstract void d();

  protected abstract T e();

  protected boolean f();
    Code:
       0: aload_0
       1: getfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
       4: getstatic     #50                 // Field ryey/easer/core/ui/data/g$a.c:Lryey/easer/core/ui/data/g$a;
       7: if_acmpne     119
      10: aload_0
      11: getfield      #31                 // Field b:Lryey/easer/core/a/a/a;
      14: aload_0
      15: getfield      #33                 // Field d:Ljava/lang/String;
      18: invokevirtual #55                 // Method ryey/easer/core/a/a/a.c:(Ljava/lang/String;)Z
      21: istore_1
      22: iload_1
      23: ifeq          67
      26: aload_0
      27: iconst_m1
      28: invokevirtual #59                 // Method setResult:(I)V
      31: new           #61                 // class java/lang/StringBuilder
      34: dup
      35: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
      38: astore_2
      39: aload_2
      40: ldc           #64                 // String Successfully deleted
      42: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      45: pop
      46: aload_2
      47: getstatic     #70                 // Field a:Ljava/lang/String;
      50: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      53: pop
      54: aload_2
      55: invokevirtual #73                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      58: invokestatic  #78                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      61: aload_0
      62: invokevirtual #81                 // Method finish:()V
      65: iload_1
      66: ireturn
      67: new           #61                 // class java/lang/StringBuilder
      70: dup
      71: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
      74: astore_2
      75: aload_2
      76: ldc           #83                 // String Failed to delete
      78: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      81: pop
      82: aload_2
      83: getstatic     #70                 // Field a:Ljava/lang/String;
      86: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      89: pop
      90: aload_2
      91: invokevirtual #73                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      94: iconst_0
      95: anewarray     #85                 // class java/lang/Object
      98: invokestatic  #88                 // Method com/b/a/i.b:(Ljava/lang/String;[Ljava/lang/Object;)V
     101: aload_0
     102: aload_0
     103: ldc           #89                 // int 2131624241
     105: invokevirtual #93                 // Method getString:(I)Ljava/lang/String;
     108: iconst_0
     109: invokestatic  #99                 // Method android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
     112: astore_2
     113: aload_2
     114: invokevirtual #102                // Method android/widget/Toast.show:()V
     117: iload_1
     118: ireturn
     119: aload_0
     120: invokevirtual #104                // Method e:()Lryey/easer/core/a/f;
     123: astore_2
     124: aload_2
     125: ifnull        318
     128: aload_2
     129: checkcast     #106                // class ryey/easer/core/a/l
     132: invokeinterface #108,  1          // InterfaceMethod ryey/easer/core/a/l.b:()Z
     137: ifne          143
     140: goto          318
     143: getstatic     #111                // Field ryey/easer/core/ui/data/b$4.a:[I
     146: aload_0
     147: getfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
     150: invokevirtual #114                // Method ryey/easer/core/ui/data/g$a.ordinal:()I
     153: iaload
     154: tableswitch   { // 1 to 2
                     1: 192
                     2: 176
               default: 374
          }
     176: aload_0
     177: getfield      #31                 // Field b:Lryey/easer/core/a/a/a;
     180: aload_0
     181: getfield      #33                 // Field d:Ljava/lang/String;
     184: aload_2
     185: invokevirtual #117                // Method ryey/easer/core/a/a/a.a:(Ljava/lang/String;Lryey/easer/core/a/f;)Z
     188: istore_1
     189: goto          201
     192: aload_0
     193: getfield      #31                 // Field b:Lryey/easer/core/a/a/a;
     196: aload_2
     197: invokevirtual #120                // Method ryey/easer/core/a/a/a.a:(Lryey/easer/core/a/f;)Z
     200: istore_1
     201: iload_1
     202: ifeq          243
     205: aload_0
     206: iconst_m1
     207: invokevirtual #59                 // Method setResult:(I)V
     210: new           #61                 // class java/lang/StringBuilder
     213: dup
     214: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
     217: astore_2
     218: aload_2
     219: ldc           #122                // String Successfully saved
     221: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     224: pop
     225: aload_2
     226: getstatic     #70                 // Field a:Ljava/lang/String;
     229: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     232: pop
     233: aload_2
     234: invokevirtual #73                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     237: invokestatic  #78                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
     240: goto          61
     243: new           #61                 // class java/lang/StringBuilder
     246: dup
     247: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
     250: astore_2
     251: aload_2
     252: ldc           #124                // String Failed to save
     254: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     257: pop
     258: aload_2
     259: getstatic     #70                 // Field a:Ljava/lang/String;
     262: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     265: pop
     266: aload_2
     267: invokevirtual #73                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     270: iconst_0
     271: anewarray     #85                 // class java/lang/Object
     274: invokestatic  #88                 // Method com/b/a/i.b:(Ljava/lang/String;[Ljava/lang/Object;)V
     277: aload_0
     278: aload_0
     279: ldc           #125                // int 2131624243
     281: invokevirtual #93                 // Method getString:(I)Ljava/lang/String;
     284: iconst_0
     285: invokestatic  #99                 // Method android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
     288: astore_2
     289: goto          113
     292: ldc           #127                // String Unexpected purpose: %s
     294: iconst_1
     295: anewarray     #85                 // class java/lang/Object
     298: dup
     299: iconst_0
     300: aload_0
     301: getfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
     304: aastore
     305: invokestatic  #129                // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
     308: new           #131                // class java/lang/UnsupportedOperationException
     311: dup
     312: ldc           #133                // String Unknown Purpose
     314: invokespecial #136                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
     317: athrow
     318: aload_0
     319: aload_0
     320: ldc           #137                // int 2131624239
     322: invokevirtual #93                 // Method getString:(I)Ljava/lang/String;
     325: iconst_1
     326: invokestatic  #99                 // Method android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
     329: invokevirtual #102                // Method android/widget/Toast.show:()V
     332: iconst_0
     333: ireturn
     334: aload_0
     335: aload_0
     336: ldc           #137                // int 2131624239
     338: invokevirtual #93                 // Method getString:(I)Ljava/lang/String;
     341: iconst_1
     342: invokestatic  #99                 // Method android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
     345: invokevirtual #102                // Method android/widget/Toast.show:()V
     348: iconst_0
     349: ireturn
     350: astore_2
     351: aload_2
     352: ldc           #139                // String IOException encountered when %s
     354: iconst_1
     355: anewarray     #85                 // class java/lang/Object
     358: dup
     359: iconst_0
     360: aload_0
     361: getfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
     364: aastore
     365: invokestatic  #142                // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
     368: iconst_0
     369: ireturn
     370: astore_2
     371: goto          334
     374: goto          292
    Exception table:
       from    to  target type
           0    22   350   Class java/io/IOException
          26    61   350   Class java/io/IOException
          61    65   350   Class java/io/IOException
          67   113   350   Class java/io/IOException
         113   117   350   Class java/io/IOException
         119   124   370   Class ryey/easer/commons/local_plugin/c
         119   124   350   Class java/io/IOException
         128   140   370   Class ryey/easer/commons/local_plugin/c
         128   140   350   Class java/io/IOException
         143   176   370   Class ryey/easer/commons/local_plugin/c
         143   176   350   Class java/io/IOException
         176   189   370   Class ryey/easer/commons/local_plugin/c
         176   189   350   Class java/io/IOException
         192   201   370   Class ryey/easer/commons/local_plugin/c
         192   201   350   Class java/io/IOException
         205   240   350   Class java/io/IOException
         243   289   350   Class java/io/IOException
         292   318   370   Class ryey/easer/commons/local_plugin/c
         292   318   350   Class java/io/IOException
         318   332   370   Class ryey/easer/commons/local_plugin/c
         318   332   350   Class java/io/IOException
         334   348   350   Class java/io/IOException

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #146                // Method android/support/v7/app/e.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: aload_0
       7: invokevirtual #148                // Method a:()Lryey/easer/core/a/a/a;
      10: putfield      #31                 // Field b:Lryey/easer/core/a/a/a;
      13: aload_0
      14: aload_0
      15: invokevirtual #152                // Method getIntent:()Landroid/content/Intent;
      18: ldc           #154                // String ryey.easer.PURPOSE
      20: invokevirtual #160                // Method android/content/Intent.getSerializableExtra:(Ljava/lang/String;)Ljava/io/Serializable;
      23: checkcast     #49                 // class ryey/easer/core/ui/data/g$a
      26: putfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
      29: aload_0
      30: getfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
      33: getstatic     #162                // Field ryey/easer/core/ui/data/g$a.a:Lryey/easer/core/ui/data/g$a;
      36: if_acmpeq     52
      39: aload_0
      40: aload_0
      41: invokevirtual #152                // Method getIntent:()Landroid/content/Intent;
      44: ldc           #164                // String ryey.easer.EVENT.NAME
      46: invokevirtual #168                // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      49: putfield      #33                 // Field d:Ljava/lang/String;
      52: aload_0
      53: getfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
      56: getstatic     #50                 // Field ryey/easer/core/ui/data/g$a.c:Lryey/easer/core/ui/data/g$a;
      59: if_acmpne     146
      62: new           #170                // class android/app/AlertDialog$Builder
      65: dup
      66: aload_0
      67: invokespecial #173                // Method android/app/AlertDialog$Builder."<init>":(Landroid/content/Context;)V
      70: astore_1
      71: aload_1
      72: ldc           #174                // int 2131623988
      74: new           #9                  // class ryey/easer/core/ui/data/b$2
      77: dup
      78: aload_0
      79: invokespecial #177                // Method ryey/easer/core/ui/data/b$2."<init>":(Lryey/easer/core/ui/data/b;)V
      82: invokevirtual #181                // Method android/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
      85: ldc           #182                // int 2131623989
      87: new           #7                  // class ryey/easer/core/ui/data/b$1
      90: dup
      91: aload_0
      92: invokespecial #183                // Method ryey/easer/core/ui/data/b$1."<init>":(Lryey/easer/core/ui/data/b;)V
      95: invokevirtual #186                // Method android/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
      98: pop
      99: aload_1
     100: aload_0
     101: ldc           #187                // int 2131624240
     103: iconst_1
     104: anewarray     #85                 // class java/lang/Object
     107: dup
     108: iconst_0
     109: aload_0
     110: getfield      #33                 // Field d:Ljava/lang/String;
     113: aastore
     114: invokevirtual #190                // Method getString:(I[Ljava/lang/Object;)Ljava/lang/String;
     117: invokevirtual #194                // Method android/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
     120: pop
     121: aload_1
     122: new           #11                 // class ryey/easer/core/ui/data/b$3
     125: dup
     126: aload_0
     127: invokespecial #195                // Method ryey/easer/core/ui/data/b$3."<init>":(Lryey/easer/core/ui/data/b;)V
     130: invokevirtual #199                // Method android/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
     133: pop
     134: aload_0
     135: ldc           #200                // int 2131689485
     137: invokevirtual #203                // Method setTheme:(I)V
     140: aload_1
     141: invokevirtual #206                // Method android/app/AlertDialog$Builder.show:()Landroid/app/AlertDialog;
     144: pop
     145: return
     146: aload_0
     147: aload_0
     148: invokevirtual #208                // Method c:()I
     151: invokevirtual #211                // Method setContentView:(I)V
     154: aload_0
     155: invokevirtual #215                // Method getSupportActionBar:()Landroid/support/v7/app/a;
     158: astore_1
     159: aload_1
     160: ifnull        174
     163: aload_1
     164: ldc           #216                // int 2131230825
     166: invokevirtual #220                // Method android/support/v7/app/a.a:(I)V
     169: aload_1
     170: iconst_1
     171: invokevirtual #223                // Method android/support/v7/app/a.b:(Z)V
     174: aload_0
     175: aload_0
     176: invokevirtual #225                // Method b:()Ljava/lang/String;
     179: invokevirtual #229                // Method setTitle:(Ljava/lang/CharSequence;)V
     182: aload_0
     183: invokevirtual #231                // Method d:()V
     186: aload_0
     187: getfield      #47                 // Field c:Lryey/easer/core/ui/data/g$a;
     190: getstatic     #233                // Field ryey/easer/core/ui/data/g$a.b:Lryey/easer/core/ui/data/g$a;
     193: if_acmpne     211
     196: aload_0
     197: aload_0
     198: getfield      #31                 // Field b:Lryey/easer/core/a/a/a;
     201: aload_0
     202: getfield      #33                 // Field d:Ljava/lang/String;
     205: invokevirtual #236                // Method ryey/easer/core/a/a/a.a:(Ljava/lang/String;)Lryey/easer/core/a/f;
     208: invokevirtual #238                // Method a:(Lryey/easer/core/a/f;)V
     211: return

  public boolean onCreateOptionsMenu(android.view.Menu);
    Code:
       0: aload_0
       1: invokevirtual #244                // Method getMenuInflater:()Landroid/view/MenuInflater;
       4: ldc           #245                // int 2131492866
       6: aload_1
       7: invokevirtual #251                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      10: aload_0
      11: aload_1
      12: invokespecial #253                // Method android/support/v7/app/e.onCreateOptionsMenu:(Landroid/view/Menu;)Z
      15: ireturn

  protected void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #256                // Method android/support/v7/app/e.onDestroy:()V
       4: aload_0
       5: aconst_null
       6: putfield      #31                 // Field b:Lryey/easer/core/a/a/a;
       9: return

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #263,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
       6: ldc_w         #264                // int 2131296284
       9: if_icmpeq     18
      12: aload_0
      13: aload_1
      14: invokespecial #266                // Method android/support/v7/app/e.onOptionsItemSelected:(Landroid/view/MenuItem;)Z
      17: ireturn
      18: aload_0
      19: invokevirtual #268                // Method f:()Z
      22: pop
      23: iconst_1
      24: ireturn

  public boolean onSupportNavigateUp();
    Code:
       0: aload_0
       1: invokevirtual #81                 // Method finish:()V
       4: iconst_0
       5: ireturn
}
