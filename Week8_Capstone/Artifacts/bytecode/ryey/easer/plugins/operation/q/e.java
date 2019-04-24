public class ryey.easer.plugins.operation.q.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.q.b> {
  android.widget.CheckBox a;

  android.widget.CheckBox b;

  android.widget.CheckBox c;

  android.widget.CheckBox d;

  android.widget.CheckBox e;

  android.widget.SeekBar f;

  android.widget.SeekBar g;

  android.widget.SeekBar h;

  android.widget.SeekBar i;

  android.widget.SeekBar j;

  android.widget.EditText k;

  public ryey.easer.plugins.operation.q.e();
    Code:
       0: aload_0
       1: invokespecial #33                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #68                 // Method b:()Lryey/easer/plugins/operation/q/b;
       4: areturn

  protected void a(ryey.easer.plugins.operation.q.b);
    Code:
       0: aload_0
       1: getfield      #71                 // Field a:Landroid/widget/CheckBox;
       4: aload_0
       5: getfield      #73                 // Field f:Landroid/widget/SeekBar;
       8: aload_1
       9: getfield      #78                 // Field ryey/easer/plugins/operation/q/b.a:Ljava/lang/Integer;
      12: invokestatic  #80                 // Method a:(Landroid/widget/CheckBox;Landroid/widget/SeekBar;Ljava/lang/Integer;)V
      15: aload_0
      16: getfield      #82                 // Field b:Landroid/widget/CheckBox;
      19: aload_0
      20: getfield      #84                 // Field g:Landroid/widget/SeekBar;
      23: aload_1
      24: getfield      #86                 // Field ryey/easer/plugins/operation/q/b.b:Ljava/lang/Integer;
      27: invokestatic  #80                 // Method a:(Landroid/widget/CheckBox;Landroid/widget/SeekBar;Ljava/lang/Integer;)V
      30: aload_0
      31: getfield      #88                 // Field c:Landroid/widget/CheckBox;
      34: aload_0
      35: getfield      #90                 // Field h:Landroid/widget/SeekBar;
      38: aload_1
      39: getfield      #92                 // Field ryey/easer/plugins/operation/q/b.c:Ljava/lang/Integer;
      42: invokestatic  #80                 // Method a:(Landroid/widget/CheckBox;Landroid/widget/SeekBar;Ljava/lang/Integer;)V
      45: aload_0
      46: getfield      #94                 // Field d:Landroid/widget/CheckBox;
      49: aload_0
      50: getfield      #96                 // Field i:Landroid/widget/SeekBar;
      53: aload_1
      54: getfield      #98                 // Field ryey/easer/plugins/operation/q/b.d:Ljava/lang/Integer;
      57: invokestatic  #80                 // Method a:(Landroid/widget/CheckBox;Landroid/widget/SeekBar;Ljava/lang/Integer;)V
      60: aload_0
      61: getfield      #100                // Field e:Landroid/widget/CheckBox;
      64: aload_0
      65: getfield      #102                // Field j:Landroid/widget/SeekBar;
      68: aload_1
      69: getfield      #104                // Field ryey/easer/plugins/operation/q/b.e:Ljava/lang/Integer;
      72: invokestatic  #80                 // Method a:(Landroid/widget/CheckBox;Landroid/widget/SeekBar;Ljava/lang/Integer;)V
      75: aload_1
      76: getfield      #104                // Field ryey/easer/plugins/operation/q/b.e:Ljava/lang/Integer;
      79: ifnull        111
      82: aload_1
      83: getfield      #106                // Field ryey/easer/plugins/operation/q/b.f:Ljava/lang/Integer;
      86: ifnonnull     95
      89: ldc           #108                // String 0
      91: astore_1
      92: goto          103
      95: aload_1
      96: getfield      #106                // Field ryey/easer/plugins/operation/q/b.f:Ljava/lang/Integer;
      99: invokevirtual #112                // Method java/lang/Integer.toString:()Ljava/lang/String;
     102: astore_1
     103: aload_0
     104: getfield      #114                // Field k:Landroid/widget/EditText;
     107: aload_1
     108: invokevirtual #120                // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
     111: return

  public ryey.easer.plugins.operation.q.b b();
    Code:
       0: aload_0
       1: getfield      #73                 // Field f:Landroid/widget/SeekBar;
       4: invokestatic  #124                // Method a:(Landroid/widget/SeekBar;)Ljava/lang/Integer;
       7: astore_2
       8: aload_0
       9: getfield      #84                 // Field g:Landroid/widget/SeekBar;
      12: invokestatic  #124                // Method a:(Landroid/widget/SeekBar;)Ljava/lang/Integer;
      15: astore_3
      16: aload_0
      17: getfield      #90                 // Field h:Landroid/widget/SeekBar;
      20: invokestatic  #124                // Method a:(Landroid/widget/SeekBar;)Ljava/lang/Integer;
      23: astore        4
      25: aload_0
      26: getfield      #96                 // Field i:Landroid/widget/SeekBar;
      29: invokestatic  #124                // Method a:(Landroid/widget/SeekBar;)Ljava/lang/Integer;
      32: astore        5
      34: aload_0
      35: getfield      #102                // Field j:Landroid/widget/SeekBar;
      38: invokestatic  #124                // Method a:(Landroid/widget/SeekBar;)Ljava/lang/Integer;
      41: astore        6
      43: aload         6
      45: ifnull        75
      48: aload_0
      49: getfield      #114                // Field k:Landroid/widget/EditText;
      52: invokevirtual #128                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      55: invokevirtual #131                // Method java/lang/Object.toString:()Ljava/lang/String;
      58: invokestatic  #134                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      61: astore_1
      62: goto          77
      65: new           #136                // class ryey/easer/commons/local_plugin/c
      68: dup
      69: ldc           #138                // String bluetooth_delay is invalid
      71: invokespecial #141                // Method ryey/easer/commons/local_plugin/c."<init>":(Ljava/lang/String;)V
      74: athrow
      75: aconst_null
      76: astore_1
      77: new           #75                 // class ryey/easer/plugins/operation/q/b
      80: dup
      81: aload_2
      82: aload_3
      83: aload         4
      85: aload         5
      87: aload         6
      89: aload_1
      90: invokespecial #144                // Method ryey/easer/plugins/operation/q/b."<init>":(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
      93: areturn
      94: astore_1
      95: goto          65
    Exception table:
       from    to  target type
          48    62    94   Class java/lang/NumberFormatException

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #75                 // class ryey/easer/plugins/operation/q/b
       5: invokevirtual #147                // Method a:(Lryey/easer/plugins/operation/q/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #150                // int 2131427457
       3: aload_2
       4: iconst_0
       5: invokevirtual #156                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: invokevirtual #160                // Method getContext:()Landroid/content/Context;
      13: ldc           #162                // String audio
      15: invokevirtual #168                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      18: checkcast     #170                // class android/media/AudioManager
      21: astore_2
      22: aload_2
      23: ifnonnull     43
      26: ldc           #172                // String Couldn't get AudioManager
      28: iconst_0
      29: anewarray     #130                // class java/lang/Object
      32: invokestatic  #177                // Method com/b/a/i.b:(Ljava/lang/String;[Ljava/lang/Object;)V
      35: new           #179                // class java/lang/IllegalAccessError
      38: dup
      39: invokespecial #180                // Method java/lang/IllegalAccessError."<init>":()V
      42: athrow
      43: aload_0
      44: aload_1
      45: ldc           #181                // int 2131296611
      47: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
      50: checkcast     #37                 // class android/widget/SeekBar
      53: putfield      #73                 // Field f:Landroid/widget/SeekBar;
      56: aload_0
      57: getfield      #73                 // Field f:Landroid/widget/SeekBar;
      60: aload_2
      61: iconst_2
      62: invokevirtual #191                // Method android/media/AudioManager.getStreamMaxVolume:(I)I
      65: invokevirtual #194                // Method android/widget/SeekBar.setMax:(I)V
      68: aload_0
      69: aload_1
      70: ldc           #195                // int 2131296338
      72: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
      75: checkcast     #53                 // class android/widget/CheckBox
      78: putfield      #71                 // Field a:Landroid/widget/CheckBox;
      81: aload_0
      82: getfield      #71                 // Field a:Landroid/widget/CheckBox;
      85: new           #7                  // class ryey/easer/plugins/operation/q/e$1
      88: dup
      89: aload_0
      90: invokespecial #198                // Method ryey/easer/plugins/operation/q/e$1."<init>":(Lryey/easer/plugins/operation/q/e;)V
      93: invokevirtual #202                // Method android/widget/CheckBox.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
      96: aload_0
      97: aload_1
      98: ldc           #203                // int 2131296609
     100: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     103: checkcast     #37                 // class android/widget/SeekBar
     106: putfield      #84                 // Field g:Landroid/widget/SeekBar;
     109: aload_0
     110: getfield      #84                 // Field g:Landroid/widget/SeekBar;
     113: aload_2
     114: iconst_3
     115: invokevirtual #191                // Method android/media/AudioManager.getStreamMaxVolume:(I)I
     118: invokevirtual #194                // Method android/widget/SeekBar.setMax:(I)V
     121: aload_0
     122: aload_1
     123: ldc           #204                // int 2131296336
     125: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     128: checkcast     #53                 // class android/widget/CheckBox
     131: putfield      #82                 // Field b:Landroid/widget/CheckBox;
     134: aload_0
     135: getfield      #82                 // Field b:Landroid/widget/CheckBox;
     138: new           #9                  // class ryey/easer/plugins/operation/q/e$2
     141: dup
     142: aload_0
     143: invokespecial #205                // Method ryey/easer/plugins/operation/q/e$2."<init>":(Lryey/easer/plugins/operation/q/e;)V
     146: invokevirtual #202                // Method android/widget/CheckBox.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
     149: aload_0
     150: aload_1
     151: ldc           #206                // int 2131296607
     153: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     156: checkcast     #37                 // class android/widget/SeekBar
     159: putfield      #90                 // Field h:Landroid/widget/SeekBar;
     162: aload_0
     163: getfield      #90                 // Field h:Landroid/widget/SeekBar;
     166: aload_2
     167: iconst_4
     168: invokevirtual #191                // Method android/media/AudioManager.getStreamMaxVolume:(I)I
     171: invokevirtual #194                // Method android/widget/SeekBar.setMax:(I)V
     174: aload_0
     175: aload_1
     176: ldc           #207                // int 2131296332
     178: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     181: checkcast     #53                 // class android/widget/CheckBox
     184: putfield      #88                 // Field c:Landroid/widget/CheckBox;
     187: aload_0
     188: getfield      #88                 // Field c:Landroid/widget/CheckBox;
     191: new           #11                 // class ryey/easer/plugins/operation/q/e$3
     194: dup
     195: aload_0
     196: invokespecial #208                // Method ryey/easer/plugins/operation/q/e$3."<init>":(Lryey/easer/plugins/operation/q/e;)V
     199: invokevirtual #202                // Method android/widget/CheckBox.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
     202: aload_0
     203: aload_1
     204: ldc           #209                // int 2131296610
     206: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     209: checkcast     #37                 // class android/widget/SeekBar
     212: putfield      #96                 // Field i:Landroid/widget/SeekBar;
     215: aload_0
     216: getfield      #96                 // Field i:Landroid/widget/SeekBar;
     219: aload_2
     220: iconst_5
     221: invokevirtual #191                // Method android/media/AudioManager.getStreamMaxVolume:(I)I
     224: invokevirtual #194                // Method android/widget/SeekBar.setMax:(I)V
     227: aload_0
     228: aload_1
     229: ldc           #210                // int 2131296337
     231: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     234: checkcast     #53                 // class android/widget/CheckBox
     237: putfield      #94                 // Field d:Landroid/widget/CheckBox;
     240: aload_0
     241: getfield      #94                 // Field d:Landroid/widget/CheckBox;
     244: new           #13                 // class ryey/easer/plugins/operation/q/e$4
     247: dup
     248: aload_0
     249: invokespecial #211                // Method ryey/easer/plugins/operation/q/e$4."<init>":(Lryey/easer/plugins/operation/q/e;)V
     252: invokevirtual #202                // Method android/widget/CheckBox.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
     255: aload_0
     256: aload_1
     257: ldc           #212                // int 2131296608
     259: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     262: checkcast     #37                 // class android/widget/SeekBar
     265: putfield      #102                // Field j:Landroid/widget/SeekBar;
     268: aload_0
     269: getfield      #102                // Field j:Landroid/widget/SeekBar;
     272: aload_2
     273: bipush        6
     275: invokevirtual #191                // Method android/media/AudioManager.getStreamMaxVolume:(I)I
     278: invokevirtual #194                // Method android/widget/SeekBar.setMax:(I)V
     281: aload_0
     282: aload_1
     283: ldc           #213                // int 2131296379
     285: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     288: checkcast     #116                // class android/widget/EditText
     291: putfield      #114                // Field k:Landroid/widget/EditText;
     294: aload_0
     295: aload_1
     296: ldc           #214                // int 2131296333
     298: invokevirtual #187                // Method android/view/View.findViewById:(I)Landroid/view/View;
     301: checkcast     #53                 // class android/widget/CheckBox
     304: putfield      #100                // Field e:Landroid/widget/CheckBox;
     307: aload_0
     308: getfield      #100                // Field e:Landroid/widget/CheckBox;
     311: new           #15                 // class ryey/easer/plugins/operation/q/e$5
     314: dup
     315: aload_0
     316: aload_1
     317: invokespecial #217                // Method ryey/easer/plugins/operation/q/e$5."<init>":(Lryey/easer/plugins/operation/q/e;Landroid/view/View;)V
     320: invokevirtual #202                // Method android/widget/CheckBox.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
     323: aload_1
     324: areturn
}
