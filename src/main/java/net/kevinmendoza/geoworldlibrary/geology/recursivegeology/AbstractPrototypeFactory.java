package net.kevinmendoza.geoworldlibrary.geology.recursivegeology;

import java.util.Random;

import com.flowpowered.math.vector.Vector2i;
import com.flowpowered.math.vector.Vector3i;

import net.kevinmendoza.geoworldlibrary.proceduralgeneration.shapes.Region;
import net.kevinmendoza.geoworldlibrary.proceduralgeneration.shapes.RegionPointGenerator;
import net.kevinmendoza.geoworldlibrary.utilities.HashCodeOperations;

public abstract class AbstractPrototypeFactory extends AbstractFactory {

	public abstract IGeologyNode makePrototype(Vector2i vec);
	public abstract IGeologyNode makeObject(AbstractPrototype prototype);
	public abstract Region makeRegion(Vector2i vec);

	protected long createVectorSeed(Vector2i vec) {
		long s = HashCodeOperations.createVectorSeed(vec);
		return hash(s);
	}

	protected long createVectorSeed(Vector3i vec) {
		long s = HashCodeOperations.createVectorSeed(vec);
		return hash(s);
	}
	
	private long hash(long s) {
		return s %(1024 + getSeed());
	}
	@Override
	public final boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof AbstractPrototypeFactory)) {
			return false;
		}
		AbstractPrototypeFactory user = (AbstractPrototypeFactory) o;
		return user.hashCode()==user.hashCode();
	}
	
	
}