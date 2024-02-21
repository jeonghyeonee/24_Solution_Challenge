package com.gdsc.solutionchallenge.app.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QImage is a Querydsl query type for Image
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QImage extends EntityPathBase<Image> {

    private static final long serialVersionUID = -886058L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QImage image = new QImage("image");

    public final com.gdsc.solutionchallenge.common.domain.QBaseEntity _super = new com.gdsc.solutionchallenge.common.domain.QBaseEntity(this);

    //inherited
    public final StringPath createdDate = _super.createdDate;

    public final StringPath fullPath = createString("fullPath");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SimplePath<com.google.type.LatLng> latLng = createSimple("latLng", com.google.type.LatLng.class);

    public final com.gdsc.solutionchallenge.member.domain.QMember member;

    public final QSpecies species;

    public final StringPath type = createString("type");

    public final StringPath uploadFileName = createString("uploadFileName");

    public QImage(String variable) {
        this(Image.class, forVariable(variable), INITS);
    }

    public QImage(Path<? extends Image> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QImage(PathMetadata metadata, PathInits inits) {
        this(Image.class, metadata, inits);
    }

    public QImage(Class<? extends Image> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.gdsc.solutionchallenge.member.domain.QMember(forProperty("member")) : null;
        this.species = inits.isInitialized("species") ? new QSpecies(forProperty("species"), inits.get("species")) : null;
    }

}
