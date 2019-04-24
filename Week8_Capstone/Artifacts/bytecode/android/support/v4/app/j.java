public class android.support.v4.app.j extends android.support.v4.app.f implements android.support.v4.app.a$a,android.support.v4.app.a$c {
  static final java.lang.String ALLOCATED_REQUEST_INDICIES_TAG;

  static final java.lang.String FRAGMENTS_TAG;

  static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;

  static final int MSG_REALLY_STOPPED;

  static final int MSG_RESUME_PENDING;

  static final java.lang.String NEXT_CANDIDATE_REQUEST_INDEX_TAG;

  static final java.lang.String REQUEST_FRAGMENT_WHO_TAG;

  boolean mCreated;

  final android.support.v4.app.l mFragments;

  final android.os.Handler mHandler;

  android.support.v4.app.z mLoaderManager;

  int mNextCandidateRequestIndex;

  android.support.v4.g.n<java.lang.String> mPendingFragmentActivityResults;

  boolean mReallyStopped;

  boolean mRequestedPermissionsFromFragment;

  boolean mResumed;

  boolean mRetaining;

  boolean mStopped;

  public android.support.v4.app.j();
    Code:
       0: aload_0
       1: invokespecial #62                 // Method android/support/v4/app/f."<init>":()V
       4: aload_0
       5: new           #10                 // class android/support/v4/app/j$1
       8: dup
       9: aload_0
      10: invokespecial #65                 // Method android/support/v4/app/j$1."<init>":(Landroid/support/v4/app/j;)V
      13: putfield      #67                 // Field mHandler:Landroid/os/Handler;
      16: aload_0
      17: new           #12                 // class android/support/v4/app/j$a
      20: dup
      21: aload_0
      22: invokespecial #68                 // Method android/support/v4/app/j$a."<init>":(Landroid/support/v4/app/j;)V
      25: invokestatic  #73                 // Method android/support/v4/app/l.a:(Landroid/support/v4/app/m;)Landroid/support/v4/app/l;
      28: putfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      31: aload_0
      32: iconst_1
      33: putfield      #77                 // Field mStopped:Z
      36: aload_0
      37: iconst_1
      38: putfield      #79                 // Field mReallyStopped:Z
      41: return

  final android.view.View dispatchFragmentsOnCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: aload_1
       5: aload_2
       6: aload_3
       7: aload         4
       9: invokevirtual #177                // Method android/support/v4/app/l.a:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
      12: areturn

  void doReallyStop(boolean);
    Code:
       0: aload_0
       1: getfield      #79                 // Field mReallyStopped:Z
       4: ifne          29
       7: aload_0
       8: iconst_1
       9: putfield      #79                 // Field mReallyStopped:Z
      12: aload_0
      13: iload_1
      14: putfield      #181                // Field mRetaining:Z
      17: aload_0
      18: getfield      #67                 // Field mHandler:Landroid/os/Handler;
      21: iconst_1
      22: invokevirtual #187                // Method android/os/Handler.removeMessages:(I)V
      25: aload_0
      26: invokevirtual #190                // Method onReallyStop:()V
      29: return

  public void dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #194                // Method android/support/v4/app/f.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
       9: aload_3
      10: aload_1
      11: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      14: aload_3
      15: ldc           #201                // String Local FragmentActivity
      17: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      20: aload_3
      21: aload_0
      22: invokestatic  #207                // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      25: invokestatic  #213                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      28: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      31: aload_3
      32: ldc           #215                // String  State:
      34: invokevirtual #218                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
      37: new           #220                // class java/lang/StringBuilder
      40: dup
      41: invokespecial #221                // Method java/lang/StringBuilder."<init>":()V
      44: astore        5
      46: aload         5
      48: aload_1
      49: invokevirtual #225                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload         5
      55: ldc           #227                // String
      57: invokevirtual #225                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: pop
      61: aload         5
      63: invokevirtual #231                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      66: astore        5
      68: aload_3
      69: aload         5
      71: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      74: aload_3
      75: ldc           #233                // String mCreated=
      77: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      80: aload_3
      81: aload_0
      82: getfield      #235                // Field mCreated:Z
      85: invokevirtual #237                // Method java/io/PrintWriter.print:(Z)V
      88: aload_3
      89: ldc           #239                // String mResumed=
      91: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      94: aload_3
      95: aload_0
      96: getfield      #241                // Field mResumed:Z
      99: invokevirtual #237                // Method java/io/PrintWriter.print:(Z)V
     102: aload_3
     103: ldc           #243                // String  mStopped=
     105: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     108: aload_3
     109: aload_0
     110: getfield      #77                 // Field mStopped:Z
     113: invokevirtual #237                // Method java/io/PrintWriter.print:(Z)V
     116: aload_3
     117: ldc           #245                // String  mReallyStopped=
     119: invokevirtual #199                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     122: aload_3
     123: aload_0
     124: getfield      #79                 // Field mReallyStopped:Z
     127: invokevirtual #247                // Method java/io/PrintWriter.println:(Z)V
     130: aload_0
     131: getfield      #249                // Field mLoaderManager:Landroid/support/v4/app/z;
     134: ifnull        150
     137: aload_0
     138: getfield      #249                // Field mLoaderManager:Landroid/support/v4/app/z;
     141: aload         5
     143: aload_2
     144: aload_3
     145: aload         4
     147: invokevirtual #253                // Method android/support/v4/app/z.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
     150: aload_0
     151: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
     154: invokevirtual #255                // Method android/support/v4/app/l.a:()Landroid/support/v4/app/n;
     157: aload_1
     158: aload_2
     159: aload_3
     160: aload         4
     162: invokevirtual #256                // Method android/support/v4/app/n.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
     165: return

  public java.lang.Object getLastCustomNonConfigurationInstance();
    Code:
       0: aload_0
       1: invokevirtual #260                // Method getLastNonConfigurationInstance:()Ljava/lang/Object;
       4: checkcast     #15                 // class android/support/v4/app/j$b
       7: astore_1
       8: aload_1
       9: ifnull        17
      12: aload_1
      13: getfield      #263                // Field android/support/v4/app/j$b.a:Ljava/lang/Object;
      16: areturn
      17: aconst_null
      18: areturn

  public android.arch.lifecycle.c getLifecycle();
    Code:
       0: aload_0
       1: invokespecial #264                // Method android/support/v4/app/f.getLifecycle:()Landroid/arch/lifecycle/c;
       4: areturn

  public android.support.v4.app.n getSupportFragmentManager();
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: invokevirtual #255                // Method android/support/v4/app/l.a:()Landroid/support/v4/app/n;
       7: areturn

  public android.support.v4.app.z getSupportLoaderManager();
    Code:
       0: aload_0
       1: getfield      #249                // Field mLoaderManager:Landroid/support/v4/app/z;
       4: ifnull        12
       7: aload_0
       8: getfield      #249                // Field mLoaderManager:Landroid/support/v4/app/z;
      11: areturn
      12: aload_0
      13: new           #268                // class android/support/v4/app/LoaderManagerImpl
      16: dup
      17: aload_0
      18: aload_0
      19: invokevirtual #272                // Method getViewModelStore:()Landroid/arch/lifecycle/p;
      22: invokespecial #275                // Method android/support/v4/app/LoaderManagerImpl."<init>":(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/p;)V
      25: putfield      #249                // Field mLoaderManager:Landroid/support/v4/app/z;
      28: aload_0
      29: getfield      #249                // Field mLoaderManager:Landroid/support/v4/app/z;
      32: areturn

  public android.arch.lifecycle.p getViewModelStore();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method getApplication:()Landroid/app/Application;
       4: ifnonnull     18
       7: new           #91                 // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #281                // String Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.
      14: invokespecial #96                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: getfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      22: ifnonnull     36
      25: aload_0
      26: new           #285                // class android/arch/lifecycle/p
      29: dup
      30: invokespecial #286                // Method android/arch/lifecycle/p."<init>":()V
      33: putfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      36: aload_0
      37: getfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      40: areturn

  protected void onActivityResult(int, int, android.content.Intent);
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: invokevirtual #290                // Method android/support/v4/app/l.b:()V
       7: iload_1
       8: bipush        16
      10: ishr
      11: istore        4
      13: iload         4
      15: ifeq          125
      18: iload         4
      20: iconst_1
      21: isub
      22: istore        4
      24: aload_0
      25: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      28: iload         4
      30: invokevirtual #293                // Method android/support/v4/g/n.a:(I)Ljava/lang/Object;
      33: checkcast     #295                // class java/lang/String
      36: astore        5
      38: aload_0
      39: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      42: iload         4
      44: invokevirtual #297                // Method android/support/v4/g/n.c:(I)V
      47: aload         5
      49: ifnonnull     62
      52: ldc           #39                 // String FragmentActivity
      54: ldc_w         #299                // String Activity result delivered for unknown Fragment.
      57: invokestatic  #305                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      60: pop
      61: return
      62: aload_0
      63: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      66: aload         5
      68: invokevirtual #308                // Method android/support/v4/app/l.a:(Ljava/lang/String;)Landroid/support/v4/app/i;
      71: astore        6
      73: aload         6
      75: ifnonnull     112
      78: new           #220                // class java/lang/StringBuilder
      81: dup
      82: invokespecial #221                // Method java/lang/StringBuilder."<init>":()V
      85: astore_3
      86: aload_3
      87: ldc_w         #310                // String Activity result no fragment exists for who:
      90: invokevirtual #225                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      93: pop
      94: aload_3
      95: aload         5
      97: invokevirtual #225                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     100: pop
     101: ldc           #39                 // String FragmentActivity
     103: aload_3
     104: invokevirtual #231                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     107: invokestatic  #305                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
     110: pop
     111: return
     112: aload         6
     114: iload_1
     115: ldc_w         #311                // int 65535
     118: iand
     119: iload_2
     120: aload_3
     121: invokevirtual #313                // Method android/support/v4/app/i.onActivityResult:(IILandroid/content/Intent;)V
     124: return
     125: invokestatic  #318                // Method android/support/v4/app/a.a:()Landroid/support/v4/app/a$b;
     128: astore        5
     130: aload         5
     132: ifnull        150
     135: aload         5
     137: aload_0
     138: iload_1
     139: iload_2
     140: aload_3
     141: invokeinterface #323,  5          // InterfaceMethod android/support/v4/app/a$b.a:(Landroid/app/Activity;IILandroid/content/Intent;)Z
     146: ifeq          150
     149: return
     150: aload_0
     151: iload_1
     152: iload_2
     153: aload_3
     154: invokespecial #324                // Method android/support/v4/app/f.onActivityResult:(IILandroid/content/Intent;)V
     157: return

  public void onAttachFragment(android.support.v4.app.i);
    Code:
       0: return

  public void onBackPressed();
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: invokevirtual #255                // Method android/support/v4/app/l.a:()Landroid/support/v4/app/n;
       7: astore_2
       8: aload_2
       9: invokevirtual #330                // Method android/support/v4/app/n.e:()Z
      12: istore_1
      13: iload_1
      14: ifeq          26
      17: getstatic     #335                // Field android/os/Build$VERSION.SDK_INT:I
      20: bipush        25
      22: if_icmpgt     26
      25: return
      26: iload_1
      27: ifne          37
      30: aload_2
      31: invokevirtual #337                // Method android/support/v4/app/n.c:()Z
      34: ifne          41
      37: aload_0
      38: invokespecial #339                // Method android/support/v4/app/f.onBackPressed:()V
      41: return

  public void onConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #343                // Method android/support/v4/app/f.onConfigurationChanged:(Landroid/content/res/Configuration;)V
       5: aload_0
       6: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       9: invokevirtual #290                // Method android/support/v4/app/l.b:()V
      12: aload_0
      13: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      16: aload_1
      17: invokevirtual #345                // Method android/support/v4/app/l.a:(Landroid/content/res/Configuration;)V
      20: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: astore        4
       6: aconst_null
       7: astore_3
       8: aload         4
      10: aconst_null
      11: invokevirtual #349                // Method android/support/v4/app/l.a:(Landroid/support/v4/app/i;)V
      14: aload_0
      15: aload_1
      16: invokespecial #351                // Method android/support/v4/app/f.onCreate:(Landroid/os/Bundle;)V
      19: aload_0
      20: invokevirtual #260                // Method getLastNonConfigurationInstance:()Ljava/lang/Object;
      23: checkcast     #15                 // class android/support/v4/app/j$b
      26: astore        6
      28: aload         6
      30: ifnull        42
      33: aload_0
      34: aload         6
      36: getfield      #353                // Field android/support/v4/app/j$b.b:Landroid/arch/lifecycle/p;
      39: putfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      42: aload_1
      43: ifnull        180
      46: aload_1
      47: ldc           #23                 // String android:support:fragments
      49: invokevirtual #359                // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
      52: astore        4
      54: aload_0
      55: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      58: astore        5
      60: aload         6
      62: ifnull        71
      65: aload         6
      67: getfield      #362                // Field android/support/v4/app/j$b.c:Landroid/support/v4/app/p;
      70: astore_3
      71: aload         5
      73: aload         4
      75: aload_3
      76: invokevirtual #365                // Method android/support/v4/app/l.a:(Landroid/os/Parcelable;Landroid/support/v4/app/p;)V
      79: aload_1
      80: ldc           #33                 // String android:support:next_request_index
      82: invokevirtual #369                // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
      85: ifeq          180
      88: aload_0
      89: aload_1
      90: ldc           #33                 // String android:support:next_request_index
      92: invokevirtual #373                // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      95: putfield      #98                 // Field mNextCandidateRequestIndex:I
      98: aload_1
      99: ldc           #20                 // String android:support:request_indicies
     101: invokevirtual #377                // Method android/os/Bundle.getIntArray:(Ljava/lang/String;)[I
     104: astore_3
     105: aload_1
     106: ldc           #36                 // String android:support:request_fragment_who
     108: invokevirtual #381                // Method android/os/Bundle.getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
     111: astore_1
     112: aload_3
     113: ifnull        171
     116: aload_1
     117: ifnull        171
     120: aload_3
     121: arraylength
     122: aload_1
     123: arraylength
     124: if_icmpeq     130
     127: goto          171
     130: aload_0
     131: new           #86                 // class android/support/v4/g/n
     134: dup
     135: aload_3
     136: arraylength
     137: invokespecial #383                // Method android/support/v4/g/n."<init>":(I)V
     140: putfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
     143: iconst_0
     144: istore_2
     145: iload_2
     146: aload_3
     147: arraylength
     148: if_icmpge     180
     151: aload_0
     152: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
     155: aload_3
     156: iload_2
     157: iaload
     158: aload_1
     159: iload_2
     160: aaload
     161: invokevirtual #110                // Method android/support/v4/g/n.b:(ILjava/lang/Object;)V
     164: iload_2
     165: iconst_1
     166: iadd
     167: istore_2
     168: goto          145
     171: ldc           #39                 // String FragmentActivity
     173: ldc_w         #385                // String Invalid requestCode mapping in savedInstanceState.
     176: invokestatic  #305                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
     179: pop
     180: aload_0
     181: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
     184: ifnonnull     203
     187: aload_0
     188: new           #86                 // class android/support/v4/g/n
     191: dup
     192: invokespecial #386                // Method android/support/v4/g/n."<init>":()V
     195: putfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
     198: aload_0
     199: iconst_0
     200: putfield      #98                 // Field mNextCandidateRequestIndex:I
     203: aload_0
     204: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
     207: invokevirtual #388                // Method android/support/v4/app/l.e:()V
     210: return

  public boolean onCreatePanelMenu(int, android.view.Menu);
    Code:
       0: iload_1
       1: ifne          24
       4: aload_0
       5: iload_1
       6: aload_2
       7: invokespecial #392                // Method android/support/v4/app/f.onCreatePanelMenu:(ILandroid/view/Menu;)Z
      10: aload_0
      11: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      14: aload_2
      15: aload_0
      16: invokevirtual #396                // Method getMenuInflater:()Landroid/view/MenuInflater;
      19: invokevirtual #399                // Method android/support/v4/app/l.a:(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
      22: ior
      23: ireturn
      24: aload_0
      25: iload_1
      26: aload_2
      27: invokespecial #392                // Method android/support/v4/app/f.onCreatePanelMenu:(ILandroid/view/Menu;)Z
      30: ireturn

  public android.view.View onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #402                // Method android/support/v4/app/f.onCreateView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
       9: areturn

  public android.view.View onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokespecial #405                // Method android/support/v4/app/f.onCreateView:(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
       7: areturn

  protected void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #408                // Method android/support/v4/app/f.onDestroy:()V
       4: aload_0
       5: iconst_0
       6: invokevirtual #410                // Method doReallyStop:(Z)V
       9: aload_0
      10: getfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      13: ifnull        30
      16: aload_0
      17: getfield      #181                // Field mRetaining:Z
      20: ifne          30
      23: aload_0
      24: getfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      27: invokevirtual #412                // Method android/arch/lifecycle/p.a:()V
      30: aload_0
      31: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      34: invokevirtual #415                // Method android/support/v4/app/l.l:()V
      37: return

  public void onLowMemory();
    Code:
       0: aload_0
       1: invokespecial #418                // Method android/support/v4/app/f.onLowMemory:()V
       4: aload_0
       5: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       8: invokevirtual #421                // Method android/support/v4/app/l.m:()V
      11: return

  public boolean onMenuItemSelected(int, android.view.MenuItem);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokespecial #425                // Method android/support/v4/app/f.onMenuItemSelected:(ILandroid/view/MenuItem;)Z
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iload_1
      12: ifeq          32
      15: iload_1
      16: bipush        6
      18: if_icmpeq     23
      21: iconst_0
      22: ireturn
      23: aload_0
      24: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      27: aload_2
      28: invokevirtual #428                // Method android/support/v4/app/l.b:(Landroid/view/MenuItem;)Z
      31: ireturn
      32: aload_0
      33: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      36: aload_2
      37: invokevirtual #430                // Method android/support/v4/app/l.a:(Landroid/view/MenuItem;)Z
      40: ireturn

  public void onMultiWindowModeChanged(boolean);
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: iload_1
       5: invokevirtual #433                // Method android/support/v4/app/l.a:(Z)V
       8: return

  protected void onNewIntent(android.content.Intent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #437                // Method android/support/v4/app/f.onNewIntent:(Landroid/content/Intent;)V
       5: aload_0
       6: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       9: invokevirtual #290                // Method android/support/v4/app/l.b:()V
      12: return

  public void onPanelClosed(int, android.view.Menu);
    Code:
       0: iload_1
       1: ifeq          7
       4: goto          15
       7: aload_0
       8: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      11: aload_2
      12: invokevirtual #442                // Method android/support/v4/app/l.b:(Landroid/view/Menu;)V
      15: aload_0
      16: iload_1
      17: aload_2
      18: invokespecial #444                // Method android/support/v4/app/f.onPanelClosed:(ILandroid/view/Menu;)V
      21: return

  protected void onPause();
    Code:
       0: aload_0
       1: invokespecial #447                // Method android/support/v4/app/f.onPause:()V
       4: aload_0
       5: iconst_0
       6: putfield      #241                // Field mResumed:Z
       9: aload_0
      10: getfield      #67                 // Field mHandler:Landroid/os/Handler;
      13: iconst_2
      14: invokevirtual #451                // Method android/os/Handler.hasMessages:(I)Z
      17: ifeq          32
      20: aload_0
      21: getfield      #67                 // Field mHandler:Landroid/os/Handler;
      24: iconst_2
      25: invokevirtual #187                // Method android/os/Handler.removeMessages:(I)V
      28: aload_0
      29: invokevirtual #454                // Method onResumeFragments:()V
      32: aload_0
      33: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      36: invokevirtual #457                // Method android/support/v4/app/l.i:()V
      39: return

  public void onPictureInPictureModeChanged(boolean);
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: iload_1
       5: invokevirtual #460                // Method android/support/v4/app/l.b:(Z)V
       8: return

  protected void onPostResume();
    Code:
       0: aload_0
       1: invokespecial #463                // Method android/support/v4/app/f.onPostResume:()V
       4: aload_0
       5: getfield      #67                 // Field mHandler:Landroid/os/Handler;
       8: iconst_2
       9: invokevirtual #187                // Method android/os/Handler.removeMessages:(I)V
      12: aload_0
      13: invokevirtual #454                // Method onResumeFragments:()V
      16: aload_0
      17: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      20: invokevirtual #466                // Method android/support/v4/app/l.n:()Z
      23: pop
      24: return

  protected boolean onPrepareOptionsPanel(android.view.View, android.view.Menu);
    Code:
       0: aload_0
       1: iconst_0
       2: aload_1
       3: aload_2
       4: invokespecial #472                // Method android/support/v4/app/f.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
       7: ireturn

  public boolean onPreparePanel(int, android.view.View, android.view.Menu);
    Code:
       0: iload_1
       1: ifne          24
       4: aload_3
       5: ifnull        24
       8: aload_0
       9: aload_2
      10: aload_3
      11: invokevirtual #474                // Method onPrepareOptionsPanel:(Landroid/view/View;Landroid/view/Menu;)Z
      14: aload_0
      15: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      18: aload_3
      19: invokevirtual #477                // Method android/support/v4/app/l.a:(Landroid/view/Menu;)Z
      22: ior
      23: ireturn
      24: aload_0
      25: iload_1
      26: aload_2
      27: aload_3
      28: invokespecial #472                // Method android/support/v4/app/f.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
      31: ireturn

  void onReallyStop();
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: invokevirtual #480                // Method android/support/v4/app/l.k:()V
       7: return

  public void onRequestPermissionsResult(int, java.lang.String[], int[]);
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: invokevirtual #290                // Method android/support/v4/app/l.b:()V
       7: iload_1
       8: bipush        16
      10: ishr
      11: ldc_w         #311                // int 65535
      14: iand
      15: istore        4
      17: iload         4
      19: ifeq          128
      22: iload         4
      24: iconst_1
      25: isub
      26: istore        4
      28: aload_0
      29: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      32: iload         4
      34: invokevirtual #293                // Method android/support/v4/g/n.a:(I)Ljava/lang/Object;
      37: checkcast     #295                // class java/lang/String
      40: astore        5
      42: aload_0
      43: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      46: iload         4
      48: invokevirtual #297                // Method android/support/v4/g/n.c:(I)V
      51: aload         5
      53: ifnonnull     66
      56: ldc           #39                 // String FragmentActivity
      58: ldc_w         #299                // String Activity result delivered for unknown Fragment.
      61: invokestatic  #305                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      64: pop
      65: return
      66: aload_0
      67: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      70: aload         5
      72: invokevirtual #308                // Method android/support/v4/app/l.a:(Ljava/lang/String;)Landroid/support/v4/app/i;
      75: astore        6
      77: aload         6
      79: ifnonnull     116
      82: new           #220                // class java/lang/StringBuilder
      85: dup
      86: invokespecial #221                // Method java/lang/StringBuilder."<init>":()V
      89: astore_2
      90: aload_2
      91: ldc_w         #310                // String Activity result no fragment exists for who:
      94: invokevirtual #225                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      97: pop
      98: aload_2
      99: aload         5
     101: invokevirtual #225                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     104: pop
     105: ldc           #39                 // String FragmentActivity
     107: aload_2
     108: invokevirtual #231                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     111: invokestatic  #305                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
     114: pop
     115: return
     116: aload         6
     118: iload_1
     119: ldc_w         #311                // int 65535
     122: iand
     123: aload_2
     124: aload_3
     125: invokevirtual #484                // Method android/support/v4/app/i.onRequestPermissionsResult:(I[Ljava/lang/String;[I)V
     128: return

  protected void onResume();
    Code:
       0: aload_0
       1: invokespecial #487                // Method android/support/v4/app/f.onResume:()V
       4: aload_0
       5: getfield      #67                 // Field mHandler:Landroid/os/Handler;
       8: iconst_2
       9: invokevirtual #490                // Method android/os/Handler.sendEmptyMessage:(I)Z
      12: pop
      13: aload_0
      14: iconst_1
      15: putfield      #241                // Field mResumed:Z
      18: aload_0
      19: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      22: invokevirtual #466                // Method android/support/v4/app/l.n:()Z
      25: pop
      26: return

  protected void onResumeFragments();
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: invokevirtual #493                // Method android/support/v4/app/l.h:()V
       7: return

  public java.lang.Object onRetainCustomNonConfigurationInstance();
    Code:
       0: aconst_null
       1: areturn

  public final java.lang.Object onRetainNonConfigurationInstance();
    Code:
       0: aload_0
       1: getfield      #77                 // Field mStopped:Z
       4: ifeq          12
       7: aload_0
       8: iconst_1
       9: invokevirtual #410                // Method doReallyStop:(Z)V
      12: aload_0
      13: invokevirtual #497                // Method onRetainCustomNonConfigurationInstance:()Ljava/lang/Object;
      16: astore_1
      17: aload_0
      18: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      21: invokevirtual #500                // Method android/support/v4/app/l.d:()Landroid/support/v4/app/p;
      24: astore_2
      25: aload_2
      26: ifnonnull     42
      29: aload_0
      30: getfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      33: ifnonnull     42
      36: aload_1
      37: ifnonnull     42
      40: aconst_null
      41: areturn
      42: new           #15                 // class android/support/v4/app/j$b
      45: dup
      46: invokespecial #501                // Method android/support/v4/app/j$b."<init>":()V
      49: astore_3
      50: aload_3
      51: aload_1
      52: putfield      #263                // Field android/support/v4/app/j$b.a:Ljava/lang/Object;
      55: aload_3
      56: aload_0
      57: getfield      #283                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      60: putfield      #353                // Field android/support/v4/app/j$b.b:Landroid/arch/lifecycle/p;
      63: aload_3
      64: aload_2
      65: putfield      #362                // Field android/support/v4/app/j$b.c:Landroid/support/v4/app/p;
      68: aload_3
      69: areturn

  protected void onSaveInstanceState(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #504                // Method android/support/v4/app/f.onSaveInstanceState:(Landroid/os/Bundle;)V
       5: aload_0
       6: invokespecial #506                // Method markFragmentsCreated:()V
       9: aload_0
      10: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      13: invokevirtual #509                // Method android/support/v4/app/l.c:()Landroid/os/Parcelable;
      16: astore_3
      17: aload_3
      18: ifnull        28
      21: aload_1
      22: ldc           #23                 // String android:support:fragments
      24: aload_3
      25: invokevirtual #513                // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      28: aload_0
      29: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      32: invokevirtual #89                 // Method android/support/v4/g/n.b:()I
      35: ifle          131
      38: aload_1
      39: ldc           #33                 // String android:support:next_request_index
      41: aload_0
      42: getfield      #98                 // Field mNextCandidateRequestIndex:I
      45: invokevirtual #517                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      48: aload_0
      49: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      52: invokevirtual #89                 // Method android/support/v4/g/n.b:()I
      55: newarray       int
      57: astore_3
      58: aload_0
      59: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      62: invokevirtual #89                 // Method android/support/v4/g/n.b:()I
      65: anewarray     #295                // class java/lang/String
      68: astore        4
      70: iconst_0
      71: istore_2
      72: iload_2
      73: aload_0
      74: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      77: invokevirtual #89                 // Method android/support/v4/g/n.b:()I
      80: if_icmpge     116
      83: aload_3
      84: iload_2
      85: aload_0
      86: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
      89: iload_2
      90: invokevirtual #519                // Method android/support/v4/g/n.d:(I)I
      93: iastore
      94: aload         4
      96: iload_2
      97: aload_0
      98: getfield      #84                 // Field mPendingFragmentActivityResults:Landroid/support/v4/g/n;
     101: iload_2
     102: invokevirtual #521                // Method android/support/v4/g/n.e:(I)Ljava/lang/Object;
     105: checkcast     #295                // class java/lang/String
     108: aastore
     109: iload_2
     110: iconst_1
     111: iadd
     112: istore_2
     113: goto          72
     116: aload_1
     117: ldc           #20                 // String android:support:request_indicies
     119: aload_3
     120: invokevirtual #525                // Method android/os/Bundle.putIntArray:(Ljava/lang/String;[I)V
     123: aload_1
     124: ldc           #36                 // String android:support:request_fragment_who
     126: aload         4
     128: invokevirtual #529                // Method android/os/Bundle.putStringArray:(Ljava/lang/String;[Ljava/lang/String;)V
     131: return

  protected void onStart();
    Code:
       0: aload_0
       1: invokespecial #532                // Method android/support/v4/app/f.onStart:()V
       4: aload_0
       5: iconst_0
       6: putfield      #77                 // Field mStopped:Z
       9: aload_0
      10: iconst_0
      11: putfield      #79                 // Field mReallyStopped:Z
      14: aload_0
      15: getfield      #67                 // Field mHandler:Landroid/os/Handler;
      18: iconst_1
      19: invokevirtual #187                // Method android/os/Handler.removeMessages:(I)V
      22: aload_0
      23: getfield      #235                // Field mCreated:Z
      26: ifne          41
      29: aload_0
      30: iconst_1
      31: putfield      #235                // Field mCreated:Z
      34: aload_0
      35: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      38: invokevirtual #534                // Method android/support/v4/app/l.f:()V
      41: aload_0
      42: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      45: invokevirtual #290                // Method android/support/v4/app/l.b:()V
      48: aload_0
      49: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      52: invokevirtual #466                // Method android/support/v4/app/l.n:()Z
      55: pop
      56: aload_0
      57: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      60: invokevirtual #537                // Method android/support/v4/app/l.g:()V
      63: return

  public void onStateNotSaved();
    Code:
       0: aload_0
       1: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
       4: invokevirtual #290                // Method android/support/v4/app/l.b:()V
       7: return

  protected void onStop();
    Code:
       0: aload_0
       1: invokespecial #541                // Method android/support/v4/app/f.onStop:()V
       4: aload_0
       5: iconst_1
       6: putfield      #77                 // Field mStopped:Z
       9: aload_0
      10: invokespecial #506                // Method markFragmentsCreated:()V
      13: aload_0
      14: getfield      #67                 // Field mHandler:Landroid/os/Handler;
      17: iconst_1
      18: invokevirtual #490                // Method android/os/Handler.sendEmptyMessage:(I)Z
      21: pop
      22: aload_0
      23: getfield      #75                 // Field mFragments:Landroid/support/v4/app/l;
      26: invokevirtual #544                // Method android/support/v4/app/l.j:()V
      29: return

  void requestPermissionsFromFragment(android.support.v4.app.i, java.lang.String[], int);
    Code:
       0: iload_3
       1: iconst_m1
       2: if_icmpne     12
       5: aload_0
       6: aload_2
       7: iload_3
       8: invokestatic  #549                // Method android/support/v4/app/a.a:(Landroid/app/Activity;[Ljava/lang/String;I)V
      11: return
      12: iload_3
      13: invokestatic  #552                // Method checkForValidRequestCode:(I)V
      16: aload_0
      17: iconst_1
      18: putfield      #554                // Field mRequestedPermissionsFromFragment:Z
      21: aload_0
      22: aload_2
      23: aload_0
      24: aload_1
      25: invokespecial #556                // Method allocateRequestIndex:(Landroid/support/v4/app/i;)I
      28: iconst_1
      29: iadd
      30: bipush        16
      32: ishl
      33: iload_3
      34: ldc_w         #311                // int 65535
      37: iand
      38: iadd
      39: invokestatic  #549                // Method android/support/v4/app/a.a:(Landroid/app/Activity;[Ljava/lang/String;I)V
      42: aload_0
      43: iconst_0
      44: putfield      #554                // Field mRequestedPermissionsFromFragment:Z
      47: return
      48: astore_1
      49: aload_0
      50: iconst_0
      51: putfield      #554                // Field mRequestedPermissionsFromFragment:Z
      54: aload_1
      55: athrow
    Exception table:
       from    to  target type
          16    42    48   any

  public void setEnterSharedElementCallback(android.support.v4.app.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #561                // Method android/support/v4/app/a.a:(Landroid/app/Activity;Landroid/support/v4/app/ah;)V
       5: return

  public void setExitSharedElementCallback(android.support.v4.app.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #564                // Method android/support/v4/app/a.b:(Landroid/app/Activity;Landroid/support/v4/app/ah;)V
       5: return

  public void startActivityForResult(android.content.Intent, int);
    Code:
       0: aload_0
       1: getfield      #569                // Field mStartedActivityFromFragment:Z
       4: ifne          16
       7: iload_2
       8: iconst_m1
       9: if_icmpeq     16
      12: iload_2
      13: invokestatic  #552                // Method checkForValidRequestCode:(I)V
      16: aload_0
      17: aload_1
      18: iload_2
      19: invokespecial #571                // Method android/support/v4/app/f.startActivityForResult:(Landroid/content/Intent;I)V
      22: return

  public void startActivityForResult(android.content.Intent, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokespecial #574                // Method android/support/v4/app/f.startActivityForResult:(Landroid/content/Intent;ILandroid/os/Bundle;)V
       7: return

  public void startActivityFromFragment(android.support.v4.app.i, android.content.Intent, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: aconst_null
       5: invokevirtual #579                // Method startActivityFromFragment:(Landroid/support/v4/app/i;Landroid/content/Intent;ILandroid/os/Bundle;)V
       8: return

  public void startActivityFromFragment(android.support.v4.app.i, android.content.Intent, int, android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #569                // Field mStartedActivityFromFragment:Z
       5: iload_3
       6: iconst_m1
       7: if_icmpne     28
      10: aload_0
      11: aload_2
      12: iconst_m1
      13: aload         4
      15: invokestatic  #582                // Method android/support/v4/app/a.a:(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
      18: aload_0
      19: iconst_0
      20: putfield      #569                // Field mStartedActivityFromFragment:Z
      23: return
      24: astore_1
      25: goto          61
      28: iload_3
      29: invokestatic  #552                // Method checkForValidRequestCode:(I)V
      32: aload_0
      33: aload_2
      34: aload_0
      35: aload_1
      36: invokespecial #556                // Method allocateRequestIndex:(Landroid/support/v4/app/i;)I
      39: iconst_1
      40: iadd
      41: bipush        16
      43: ishl
      44: iload_3
      45: ldc_w         #311                // int 65535
      48: iand
      49: iadd
      50: aload         4
      52: invokestatic  #582                // Method android/support/v4/app/a.a:(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
      55: aload_0
      56: iconst_0
      57: putfield      #569                // Field mStartedActivityFromFragment:Z
      60: return
      61: aload_0
      62: iconst_0
      63: putfield      #569                // Field mStartedActivityFromFragment:Z
      66: aload_1
      67: athrow
    Exception table:
       from    to  target type
          10    18    24   any
          28    55    24   any

  public void startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: iload         4
       6: iload         5
       8: iload         6
      10: invokespecial #586                // Method android/support/v4/app/f.startIntentSenderForResult:(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
      13: return

  public void startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: iload         4
       6: iload         5
       8: iload         6
      10: aload         7
      12: invokespecial #589                // Method android/support/v4/app/f.startIntentSenderForResult:(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      15: return

  public void startIntentSenderFromFragment(android.support.v4.app.i, android.content.IntentSender, int, android.content.Intent, int, int, int, android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #594                // Field mStartedIntentSenderFromFragment:Z
       5: iload_3
       6: iconst_m1
       7: if_icmpne     36
      10: aload_0
      11: aload_2
      12: iload_3
      13: aload         4
      15: iload         5
      17: iload         6
      19: iload         7
      21: aload         8
      23: invokestatic  #597                // Method android/support/v4/app/a.a:(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      26: aload_0
      27: iconst_0
      28: putfield      #594                // Field mStartedIntentSenderFromFragment:Z
      31: return
      32: astore_1
      33: goto          77
      36: iload_3
      37: invokestatic  #552                // Method checkForValidRequestCode:(I)V
      40: aload_0
      41: aload_2
      42: aload_0
      43: aload_1
      44: invokespecial #556                // Method allocateRequestIndex:(Landroid/support/v4/app/i;)I
      47: iconst_1
      48: iadd
      49: bipush        16
      51: ishl
      52: ldc_w         #311                // int 65535
      55: iload_3
      56: iand
      57: iadd
      58: aload         4
      60: iload         5
      62: iload         6
      64: iload         7
      66: aload         8
      68: invokestatic  #597                // Method android/support/v4/app/a.a:(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      71: aload_0
      72: iconst_0
      73: putfield      #594                // Field mStartedIntentSenderFromFragment:Z
      76: return
      77: aload_0
      78: iconst_0
      79: putfield      #594                // Field mStartedIntentSenderFromFragment:Z
      82: aload_1
      83: athrow
    Exception table:
       from    to  target type
          10    26    32   any
          36    71    32   any

  public void supportFinishAfterTransition();
    Code:
       0: aload_0
       1: invokestatic  #601                // Method android/support/v4/app/a.b:(Landroid/app/Activity;)V
       4: return

  public void supportInvalidateOptionsMenu();
    Code:
       0: aload_0
       1: invokevirtual #606                // Method invalidateOptionsMenu:()V
       4: return

  public void supportPostponeEnterTransition();
    Code:
       0: aload_0
       1: invokestatic  #610                // Method android/support/v4/app/a.c:(Landroid/app/Activity;)V
       4: return

  public void supportStartPostponedEnterTransition();
    Code:
       0: aload_0
       1: invokestatic  #613                // Method android/support/v4/app/a.d:(Landroid/app/Activity;)V
       4: return

  public final void validateRequestPermissionsRequestCode(int);
    Code:
       0: aload_0
       1: getfield      #554                // Field mRequestedPermissionsFromFragment:Z
       4: ifne          16
       7: iload_1
       8: iconst_m1
       9: if_icmpeq     16
      12: iload_1
      13: invokestatic  #552                // Method checkForValidRequestCode:(I)V
      16: return
}
