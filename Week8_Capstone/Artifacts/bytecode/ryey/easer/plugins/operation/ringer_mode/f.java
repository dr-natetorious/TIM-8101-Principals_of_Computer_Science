public class ryey.easer.plugins.operation.ringer_mode.f extends ryey.easer.plugins.c<ryey.easer.plugins.operation.ringer_mode.c> {
  android.widget.RadioButton a;

  android.widget.RadioButton b;

  android.widget.RadioButton c;

  android.view.ViewGroup d;

  android.widget.RadioButton e;

  android.widget.RadioButton f;

  android.widget.RadioButton g;

  android.widget.RadioButton h;

  public ryey.easer.plugins.operation.ringer_mode.f();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #26                 // Method b:()Lryey/easer/plugins/operation/ringer_mode/c;
       4: areturn

  protected void a(ryey.easer.plugins.operation.ringer_mode.c);
    Code:
       0: aload_1
       1: getfield      #32                 // Field ryey/easer/plugins/operation/ringer_mode/c.a:Lryey/easer/plugins/operation/ringer_mode/a;
       4: invokestatic  #37                 // Method ryey/easer/plugins/operation/ringer_mode/a.a:(Lryey/easer/plugins/operation/ringer_mode/a;)Lryey/easer/plugins/operation/ringer_mode/a;
       7: astore_1
       8: aload_1
       9: getstatic     #38                 // Field ryey/easer/plugins/operation/ringer_mode/a.a:Lryey/easer/plugins/operation/ringer_mode/a;
      12: if_acmpne     26
      15: aload_0
      16: getfield      #40                 // Field a:Landroid/widget/RadioButton;
      19: astore_1
      20: aload_1
      21: iconst_1
      22: invokevirtual #46                 // Method android/widget/RadioButton.setChecked:(Z)V
      25: return
      26: aload_1
      27: getstatic     #48                 // Field ryey/easer/plugins/operation/ringer_mode/a.b:Lryey/easer/plugins/operation/ringer_mode/a;
      30: if_acmpne     41
      33: aload_0
      34: getfield      #50                 // Field b:Landroid/widget/RadioButton;
      37: astore_1
      38: goto          20
      41: aload_1
      42: getstatic     #52                 // Field ryey/easer/plugins/operation/ringer_mode/a.c:Lryey/easer/plugins/operation/ringer_mode/a;
      45: if_acmpne     56
      48: aload_0
      49: getfield      #54                 // Field c:Landroid/widget/RadioButton;
      52: astore_1
      53: goto          20
      56: aload_0
      57: getfield      #54                 // Field c:Landroid/widget/RadioButton;
      60: iconst_1
      61: invokevirtual #46                 // Method android/widget/RadioButton.setChecked:(Z)V
      64: aload_1
      65: getstatic     #56                 // Field ryey/easer/plugins/operation/ringer_mode/a.d:Lryey/easer/plugins/operation/ringer_mode/a;
      68: if_acmpne     79
      71: aload_0
      72: getfield      #58                 // Field e:Landroid/widget/RadioButton;
      75: astore_1
      76: goto          20
      79: aload_1
      80: getstatic     #60                 // Field ryey/easer/plugins/operation/ringer_mode/a.e:Lryey/easer/plugins/operation/ringer_mode/a;
      83: if_acmpne     94
      86: aload_0
      87: getfield      #62                 // Field f:Landroid/widget/RadioButton;
      90: astore_1
      91: goto          20
      94: aload_1
      95: getstatic     #64                 // Field ryey/easer/plugins/operation/ringer_mode/a.f:Lryey/easer/plugins/operation/ringer_mode/a;
      98: if_acmpne     109
     101: aload_0
     102: getfield      #66                 // Field g:Landroid/widget/RadioButton;
     105: astore_1
     106: goto          20
     109: aload_0
     110: getfield      #68                 // Field h:Landroid/widget/RadioButton;
     113: astore_1
     114: goto          20

  public ryey.easer.plugins.operation.ringer_mode.c b();
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Landroid/widget/RadioButton;
       4: invokevirtual #72                 // Method android/widget/RadioButton.isChecked:()Z
       7: ifeq          17
      10: getstatic     #38                 // Field ryey/easer/plugins/operation/ringer_mode/a.a:Lryey/easer/plugins/operation/ringer_mode/a;
      13: astore_1
      14: goto          138
      17: aload_0
      18: getfield      #50                 // Field b:Landroid/widget/RadioButton;
      21: invokevirtual #72                 // Method android/widget/RadioButton.isChecked:()Z
      24: ifeq          34
      27: getstatic     #48                 // Field ryey/easer/plugins/operation/ringer_mode/a.b:Lryey/easer/plugins/operation/ringer_mode/a;
      30: astore_1
      31: goto          138
      34: aload_0
      35: getfield      #54                 // Field c:Landroid/widget/RadioButton;
      38: invokevirtual #72                 // Method android/widget/RadioButton.isChecked:()Z
      41: ifeq          127
      44: getstatic     #78                 // Field android/os/Build$VERSION.SDK_INT:I
      47: bipush        21
      49: if_icmpge     59
      52: getstatic     #52                 // Field ryey/easer/plugins/operation/ringer_mode/a.c:Lryey/easer/plugins/operation/ringer_mode/a;
      55: astore_1
      56: goto          138
      59: aload_0
      60: getfield      #58                 // Field e:Landroid/widget/RadioButton;
      63: invokevirtual #72                 // Method android/widget/RadioButton.isChecked:()Z
      66: ifeq          76
      69: getstatic     #56                 // Field ryey/easer/plugins/operation/ringer_mode/a.d:Lryey/easer/plugins/operation/ringer_mode/a;
      72: astore_1
      73: goto          138
      76: aload_0
      77: getfield      #62                 // Field f:Landroid/widget/RadioButton;
      80: invokevirtual #72                 // Method android/widget/RadioButton.isChecked:()Z
      83: ifeq          93
      86: getstatic     #60                 // Field ryey/easer/plugins/operation/ringer_mode/a.e:Lryey/easer/plugins/operation/ringer_mode/a;
      89: astore_1
      90: goto          138
      93: aload_0
      94: getfield      #66                 // Field g:Landroid/widget/RadioButton;
      97: invokevirtual #72                 // Method android/widget/RadioButton.isChecked:()Z
     100: ifeq          110
     103: getstatic     #64                 // Field ryey/easer/plugins/operation/ringer_mode/a.f:Lryey/easer/plugins/operation/ringer_mode/a;
     106: astore_1
     107: goto          138
     110: aload_0
     111: getfield      #68                 // Field h:Landroid/widget/RadioButton;
     114: invokevirtual #72                 // Method android/widget/RadioButton.isChecked:()Z
     117: ifeq          127
     120: getstatic     #80                 // Field ryey/easer/plugins/operation/ringer_mode/a.g:Lryey/easer/plugins/operation/ringer_mode/a;
     123: astore_1
     124: goto          138
     127: ldc           #82                 // String Select RingerMode run out of cases
     129: iconst_0
     130: anewarray     #84                 // class java/lang/Object
     133: invokestatic  #89                 // Method ryey/easer/b.a:(Ljava/lang/String;[Ljava/lang/Object;)V
     136: aconst_null
     137: astore_1
     138: new           #29                 // class ryey/easer/plugins/operation/ringer_mode/c
     141: dup
     142: aload_1
     143: invokespecial #92                 // Method ryey/easer/plugins/operation/ringer_mode/c."<init>":(Lryey/easer/plugins/operation/ringer_mode/a;)V
     146: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #29                 // class ryey/easer/plugins/operation/ringer_mode/c
       5: invokevirtual #95                 // Method a:(Lryey/easer/plugins/operation/ringer_mode/c;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #98                 // int 2131427452
       3: aload_2
       4: iconst_0
       5: invokevirtual #104                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #105                // int 2131296538
      13: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #42                 // class android/widget/RadioButton
      19: putfield      #40                 // Field a:Landroid/widget/RadioButton;
      22: aload_0
      23: aload_1
      24: ldc           #112                // int 2131296557
      26: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #42                 // class android/widget/RadioButton
      32: putfield      #50                 // Field b:Landroid/widget/RadioButton;
      35: aload_0
      36: aload_1
      37: ldc           #113                // int 2131296554
      39: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
      42: checkcast     #42                 // class android/widget/RadioButton
      45: putfield      #54                 // Field c:Landroid/widget/RadioButton;
      48: getstatic     #78                 // Field android/os/Build$VERSION.SDK_INT:I
      51: bipush        21
      53: if_icmplt     144
      56: aload_0
      57: aload_1
      58: ldc           #114                // int 2131296350
      60: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
      63: checkcast     #116                // class android/view/ViewGroup
      66: putfield      #118                // Field d:Landroid/view/ViewGroup;
      69: aload_0
      70: getfield      #54                 // Field c:Landroid/widget/RadioButton;
      73: new           #7                  // class ryey/easer/plugins/operation/ringer_mode/f$1
      76: dup
      77: aload_0
      78: invokespecial #121                // Method ryey/easer/plugins/operation/ringer_mode/f$1."<init>":(Lryey/easer/plugins/operation/ringer_mode/f;)V
      81: invokevirtual #125                // Method android/widget/RadioButton.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
      84: aload_0
      85: aload_1
      86: ldc           #126                // int 2131296526
      88: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
      91: checkcast     #42                 // class android/widget/RadioButton
      94: putfield      #58                 // Field e:Landroid/widget/RadioButton;
      97: aload_0
      98: aload_1
      99: ldc           #127                // int 2131296528
     101: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
     104: checkcast     #42                 // class android/widget/RadioButton
     107: putfield      #62                 // Field f:Landroid/widget/RadioButton;
     110: aload_0
     111: aload_1
     112: ldc           #128                // int 2131296527
     114: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
     117: checkcast     #42                 // class android/widget/RadioButton
     120: putfield      #66                 // Field g:Landroid/widget/RadioButton;
     123: getstatic     #78                 // Field android/os/Build$VERSION.SDK_INT:I
     126: bipush        23
     128: if_icmplt     144
     131: aload_0
     132: aload_1
     133: ldc           #129                // int 2131296525
     135: invokevirtual #111                // Method android/view/View.findViewById:(I)Landroid/view/View;
     138: checkcast     #42                 // class android/widget/RadioButton
     141: putfield      #68                 // Field h:Landroid/widget/RadioButton;
     144: aload_1
     145: areturn
}
