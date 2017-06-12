package co.smartreceipts.android.di.subcomponents;

import co.smartreceipts.android.di.scopes.FragmentScope;
import co.smartreceipts.android.graphs.GraphsFragment;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@FragmentScope
@Subcomponent
public interface GraphsFragmentSubcomponent extends AndroidInjector<GraphsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GraphsFragment> {
    }
}
