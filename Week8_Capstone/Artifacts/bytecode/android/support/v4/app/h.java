public class android.support.v4.app.h extends android.support.v4.app.i implements android.content.DialogInterface$OnCancelListener,android.content.DialogInterface$OnDismissListener {
  int a;

  int b;

  boolean c;

  boolean d;

  int e;

  android.app.Dialog f;

  boolean g;

  boolean h;

  boolean i;

  public android.support.v4.app.h();
    Code:
       0: aload_0
       1: invokespecial #24                 // Method android/support/v4/app/i."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #26                 // Field a:I
       9: aload_0
      10: iconst_0
      11: putfield      #28                 // Field b:I
      14: aload_0
      15: iconst_1
      16: putfield      #30                 // Field c:Z
      19: aload_0
      20: iconst_1
      21: putfield      #32                 // Field d:Z
      24: aload_0
      25: iconst_m1
      26: putfield      #34                 // Field e:I
      29: return

  public android.app.Dialog a(android.os.Bundle);
    Code:
       0: new           #38                 // class android/app/Dialog
       3: dup
       4: aload_0
       5: invokevirtual #42                 // Method getActivity:()Landroid/support/v4/app/j;
       8: aload_0
       9: invokevirtual #45                 // Method b:()I
      12: invokespecial #48                 // Method android/app/Dialog."<init>":(Landroid/content/Context;I)V
      15: areturn

  public void a();
    Code:
       0: aload_0
       1: iconst_0
       2: invokevirtual #51                 // Method a:(Z)V
       5: return

  public void a(android.app.Dialog, int);
    Code:
       0: iload_2
       1: tableswitch   { // 1 to 3
                     1: 38
                     2: 38
                     3: 29
               default: 28
          }
      28: return
      29: aload_1
      30: invokevirtual #56                 // Method android/app/Dialog.getWindow:()Landroid/view/Window;
      33: bipush        24
      35: invokevirtual #62                 // Method android/view/Window.addFlags:(I)V
      38: aload_1
      39: iconst_1
      40: invokevirtual #66                 // Method android/app/Dialog.requestWindowFeature:(I)Z
      43: pop
      44: return

  public void a(android.support.v4.app.n, java.lang.String);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #69                 // Field h:Z
       5: aload_0
       6: iconst_1
       7: putfield      #71                 // Field i:Z
      10: aload_1
      11: invokevirtual #76                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      14: astore_1
      15: aload_1
      16: aload_0
      17: aload_2
      18: invokevirtual #81                 // Method android/support/v4/app/u.a:(Landroid/support/v4/app/i;Ljava/lang/String;)Landroid/support/v4/app/u;
      21: pop
      22: aload_1
      23: invokevirtual #83                 // Method android/support/v4/app/u.c:()I
      26: pop
      27: return

  void a(boolean);
    Code:
       0: aload_0
       1: getfield      #69                 // Field h:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: iconst_1
      10: putfield      #69                 // Field h:Z
      13: aload_0
      14: iconst_0
      15: putfield      #71                 // Field i:Z
      18: aload_0
      19: getfield      #85                 // Field f:Landroid/app/Dialog;
      22: ifnull        32
      25: aload_0
      26: getfield      #85                 // Field f:Landroid/app/Dialog;
      29: invokevirtual #88                 // Method android/app/Dialog.dismiss:()V
      32: aload_0
      33: iconst_1
      34: putfield      #90                 // Field g:Z
      37: aload_0
      38: getfield      #34                 // Field e:I
      41: iflt          62
      44: aload_0
      45: invokevirtual #94                 // Method getFragmentManager:()Landroid/support/v4/app/n;
      48: aload_0
      49: getfield      #34                 // Field e:I
      52: iconst_1
      53: invokevirtual #97                 // Method android/support/v4/app/n.a:(II)V
      56: aload_0
      57: iconst_m1
      58: putfield      #34                 // Field e:I
      61: return
      62: aload_0
      63: invokevirtual #94                 // Method getFragmentManager:()Landroid/support/v4/app/n;
      66: invokevirtual #76                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      69: astore_2
      70: aload_2
      71: aload_0
      72: invokevirtual #100                // Method android/support/v4/app/u.a:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
      75: pop
      76: iload_1
      77: ifeq          86
      80: aload_2
      81: invokevirtual #102                // Method android/support/v4/app/u.d:()I
      84: pop
      85: return
      86: aload_2
      87: invokevirtual #83                 // Method android/support/v4/app/u.c:()I
      90: pop
      91: return

  public int b();
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:I
       4: ireturn

  public void onActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #106                // Method android/support/v4/app/i.onActivityCreated:(Landroid/os/Bundle;)V
       5: aload_0
       6: getfield      #32                 // Field d:Z
       9: ifne          13
      12: return
      13: aload_0
      14: invokevirtual #110                // Method getView:()Landroid/view/View;
      17: astore_2
      18: aload_2
      19: ifnull        47
      22: aload_2
      23: invokevirtual #116                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      26: ifnull        39
      29: new           #118                // class java/lang/IllegalStateException
      32: dup
      33: ldc           #120                // String DialogFragment can not be attached to a container view
      35: invokespecial #123                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      38: athrow
      39: aload_0
      40: getfield      #85                 // Field f:Landroid/app/Dialog;
      43: aload_2
      44: invokevirtual #127                // Method android/app/Dialog.setContentView:(Landroid/view/View;)V
      47: aload_0
      48: invokevirtual #42                 // Method getActivity:()Landroid/support/v4/app/j;
      51: astore_2
      52: aload_2
      53: ifnull        64
      56: aload_0
      57: getfield      #85                 // Field f:Landroid/app/Dialog;
      60: aload_2
      61: invokevirtual #131                // Method android/app/Dialog.setOwnerActivity:(Landroid/app/Activity;)V
      64: aload_0
      65: getfield      #85                 // Field f:Landroid/app/Dialog;
      68: aload_0
      69: getfield      #30                 // Field c:Z
      72: invokevirtual #134                // Method android/app/Dialog.setCancelable:(Z)V
      75: aload_0
      76: getfield      #85                 // Field f:Landroid/app/Dialog;
      79: aload_0
      80: invokevirtual #138                // Method android/app/Dialog.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)V
      83: aload_0
      84: getfield      #85                 // Field f:Landroid/app/Dialog;
      87: aload_0
      88: invokevirtual #142                // Method android/app/Dialog.setOnDismissListener:(Landroid/content/DialogInterface$OnDismissListener;)V
      91: aload_1
      92: ifnull        114
      95: aload_1
      96: ldc           #144                // String android:savedDialogState
      98: invokevirtual #150                // Method android/os/Bundle.getBundle:(Ljava/lang/String;)Landroid/os/Bundle;
     101: astore_1
     102: aload_1
     103: ifnull        114
     106: aload_0
     107: getfield      #85                 // Field f:Landroid/app/Dialog;
     110: aload_1
     111: invokevirtual #153                // Method android/app/Dialog.onRestoreInstanceState:(Landroid/os/Bundle;)V
     114: return

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #157                // Method android/support/v4/app/i.onAttach:(Landroid/content/Context;)V
       5: aload_0
       6: getfield      #71                 // Field i:Z
       9: ifne          17
      12: aload_0
      13: iconst_0
      14: putfield      #69                 // Field h:Z
      17: return

  public void onCancel(android.content.DialogInterface);
    Code:
       0: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #162                // Method android/support/v4/app/i.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: getfield      #165                // Field mContainerId:I
       9: ifne          17
      12: iconst_1
      13: istore_2
      14: goto          19
      17: iconst_0
      18: istore_2
      19: aload_0
      20: iload_2
      21: putfield      #32                 // Field d:Z
      24: aload_1
      25: ifnull        86
      28: aload_0
      29: aload_1
      30: ldc           #167                // String android:style
      32: iconst_0
      33: invokevirtual #171                // Method android/os/Bundle.getInt:(Ljava/lang/String;I)I
      36: putfield      #26                 // Field a:I
      39: aload_0
      40: aload_1
      41: ldc           #173                // String android:theme
      43: iconst_0
      44: invokevirtual #171                // Method android/os/Bundle.getInt:(Ljava/lang/String;I)I
      47: putfield      #28                 // Field b:I
      50: aload_0
      51: aload_1
      52: ldc           #175                // String android:cancelable
      54: iconst_1
      55: invokevirtual #179                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
      58: putfield      #30                 // Field c:Z
      61: aload_0
      62: aload_1
      63: ldc           #181                // String android:showsDialog
      65: aload_0
      66: getfield      #32                 // Field d:Z
      69: invokevirtual #179                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
      72: putfield      #32                 // Field d:Z
      75: aload_0
      76: aload_1
      77: ldc           #183                // String android:backStackId
      79: iconst_m1
      80: invokevirtual #171                // Method android/os/Bundle.getInt:(Ljava/lang/String;I)I
      83: putfield      #34                 // Field e:I
      86: return

  public void onDestroyView();
    Code:
       0: aload_0
       1: invokespecial #186                // Method android/support/v4/app/i.onDestroyView:()V
       4: aload_0
       5: getfield      #85                 // Field f:Landroid/app/Dialog;
       8: ifnull        28
      11: aload_0
      12: iconst_1
      13: putfield      #90                 // Field g:Z
      16: aload_0
      17: getfield      #85                 // Field f:Landroid/app/Dialog;
      20: invokevirtual #88                 // Method android/app/Dialog.dismiss:()V
      23: aload_0
      24: aconst_null
      25: putfield      #85                 // Field f:Landroid/app/Dialog;
      28: return

  public void onDetach();
    Code:
       0: aload_0
       1: invokespecial #189                // Method android/support/v4/app/i.onDetach:()V
       4: aload_0
       5: getfield      #71                 // Field i:Z
       8: ifne          23
      11: aload_0
      12: getfield      #69                 // Field h:Z
      15: ifne          23
      18: aload_0
      19: iconst_1
      20: putfield      #69                 // Field h:Z
      23: return

  public void onDismiss(android.content.DialogInterface);
    Code:
       0: aload_0
       1: getfield      #90                 // Field g:Z
       4: ifne          12
       7: aload_0
       8: iconst_1
       9: invokevirtual #51                 // Method a:(Z)V
      12: return

  public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #32                 // Field d:Z
       4: ifne          13
       7: aload_0
       8: aload_1
       9: invokespecial #194                // Method android/support/v4/app/i.onGetLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
      12: areturn
      13: aload_0
      14: aload_0
      15: aload_1
      16: invokevirtual #196                // Method a:(Landroid/os/Bundle;)Landroid/app/Dialog;
      19: putfield      #85                 // Field f:Landroid/app/Dialog;
      22: aload_0
      23: getfield      #85                 // Field f:Landroid/app/Dialog;
      26: ifnull        59
      29: aload_0
      30: aload_0
      31: getfield      #85                 // Field f:Landroid/app/Dialog;
      34: aload_0
      35: getfield      #26                 // Field a:I
      38: invokevirtual #198                // Method a:(Landroid/app/Dialog;I)V
      41: aload_0
      42: getfield      #85                 // Field f:Landroid/app/Dialog;
      45: invokevirtual #202                // Method android/app/Dialog.getContext:()Landroid/content/Context;
      48: astore_1
      49: aload_1
      50: ldc           #204                // String layout_inflater
      52: invokevirtual #210                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      55: checkcast     #212                // class android/view/LayoutInflater
      58: areturn
      59: aload_0
      60: getfield      #216                // Field mHost:Landroid/support/v4/app/m;
      63: invokevirtual #220                // Method android/support/v4/app/m.i:()Landroid/content/Context;
      66: astore_1
      67: goto          49

  public void onSaveInstanceState(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #223                // Method android/support/v4/app/i.onSaveInstanceState:(Landroid/os/Bundle;)V
       5: aload_0
       6: getfield      #85                 // Field f:Landroid/app/Dialog;
       9: ifnull        31
      12: aload_0
      13: getfield      #85                 // Field f:Landroid/app/Dialog;
      16: invokevirtual #226                // Method android/app/Dialog.onSaveInstanceState:()Landroid/os/Bundle;
      19: astore_2
      20: aload_2
      21: ifnull        31
      24: aload_1
      25: ldc           #144                // String android:savedDialogState
      27: aload_2
      28: invokevirtual #230                // Method android/os/Bundle.putBundle:(Ljava/lang/String;Landroid/os/Bundle;)V
      31: aload_0
      32: getfield      #26                 // Field a:I
      35: ifeq          48
      38: aload_1
      39: ldc           #167                // String android:style
      41: aload_0
      42: getfield      #26                 // Field a:I
      45: invokevirtual #234                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      48: aload_0
      49: getfield      #28                 // Field b:I
      52: ifeq          65
      55: aload_1
      56: ldc           #173                // String android:theme
      58: aload_0
      59: getfield      #28                 // Field b:I
      62: invokevirtual #234                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      65: aload_0
      66: getfield      #30                 // Field c:Z
      69: ifne          82
      72: aload_1
      73: ldc           #175                // String android:cancelable
      75: aload_0
      76: getfield      #30                 // Field c:Z
      79: invokevirtual #238                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      82: aload_0
      83: getfield      #32                 // Field d:Z
      86: ifne          99
      89: aload_1
      90: ldc           #181                // String android:showsDialog
      92: aload_0
      93: getfield      #32                 // Field d:Z
      96: invokevirtual #238                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      99: aload_0
     100: getfield      #34                 // Field e:I
     103: iconst_m1
     104: if_icmpeq     117
     107: aload_1
     108: ldc           #183                // String android:backStackId
     110: aload_0
     111: getfield      #34                 // Field e:I
     114: invokevirtual #234                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
     117: return

  public void onStart();
    Code:
       0: aload_0
       1: invokespecial #241                // Method android/support/v4/app/i.onStart:()V
       4: aload_0
       5: getfield      #85                 // Field f:Landroid/app/Dialog;
       8: ifnull        23
      11: aload_0
      12: iconst_0
      13: putfield      #90                 // Field g:Z
      16: aload_0
      17: getfield      #85                 // Field f:Landroid/app/Dialog;
      20: invokevirtual #244                // Method android/app/Dialog.show:()V
      23: return

  public void onStop();
    Code:
       0: aload_0
       1: invokespecial #247                // Method android/support/v4/app/i.onStop:()V
       4: aload_0
       5: getfield      #85                 // Field f:Landroid/app/Dialog;
       8: ifnull        18
      11: aload_0
      12: getfield      #85                 // Field f:Landroid/app/Dialog;
      15: invokevirtual #250                // Method android/app/Dialog.hide:()V
      18: return
}
