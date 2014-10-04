package org.jvnet.inflector;
import org.jvnet.inflector.Pluralizer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PluralizerTest extends TestCase {

  private String singular;
  private String plural;

  public PluralizerTest(String singular, String plural) {
    super(singular);
    this.singular = singular;
    this.plural = plural.replaceFirst("\\|.*", ""); // default to anglicized
  }

  @@Override
  protected void runTest() {
    Pluralizer pluralizer = new Pluralizer();
    assertEquals(plural, pluralizer.pluralizeNoun(singular));
  }

  public static Test suite() {
    TestSuite suite = new TestSuite();
    for (int i = 0; i < DATA.length; i++) {
      String singular = DATA[i][0];
      String plural = DATA[i][1];
      suite.addTest(new PluralizerTest(singular, plural));
    }
    return suite;
  }

  private static final String[][] DATA = {
      { "Jerry", "Jerrys" },
      { "atman", "atmas" },
      { "macro", "macros" },
      { "a", "as" },
      { "A.C.R.O.N.Y.M.", "A.C.R.O.N.Y.M.s" },
      { "abscissa", "abscissas|abscissae" },
      { "Achinese", "Achinese" },
      { "acropolis", "acropolises" },
      { "adieu", "adieus|adieux" },
      { "adjutant general", "adjutant generals" },
      { "aegis", "aegises" },
      { "afflatus", "afflatuses" },
      { "afreet", "afreets|afreeti" },
      { "afrit", "afrits|afriti" },
      { "agendum", "agenda" },
      { "aide-de-camp", "aides-de-camp" },
      { "Alabaman", "Alabamans" },
      { "albino", "albinos" },
      { "album", "albums" },
      { "Alfurese", "Alfurese" },
      { "alga", "algae" },
      { "alias", "aliases" },
      { "alto", "altos|alti" },
      { "alumna", "alumnae" },
      { "alumnus", "alumni" },
      { "alveolus", "alveoli" },
      { "ambassador-at-large", "ambassadors-at-large" },
      { "Amboinese", "Amboinese" },
      { "Americanese", "Americanese" },
      { "amoeba", "amoebas|amoebae" },
      { "Amoyese", "Amoyese" },
      { "analysis", "analyses" },
      { "anathema", "anathemas|anathemata" },
      { "Andamanese", "Andamanese" },
      { "Angolese", "Angolese" },
      { "Annamese", "Annamese" },
      { "antenna", "antennas|antennae" },
      { "anus", "anuses" },
      { "apex", "apexes|apices" },
      { "aphelion", "aphelia" },
      { "apparatus", "apparatuses|apparatus" },
      { "appendix", "appendixes|appendices" },
      { "apple", "apples" },
      { "aquarium", "aquariums|aquaria" },
      { "Aragonese", "Aragonese" },
      { "Arakanese", "Arakanese" },
      { "archipelago", "archipelagos" },
      { "armadillo", "armadillos" },
      { "arpeggio", "arpeggios" },
      { "arthritis", "arthritises|arthritides" },
      { "asbestos", "asbestoses" },
      { "asparagus", "asparaguses" },
      { "ass", "asses" },
      { "asylum", "asylums" },
      { "asyndeton", "asyndeta" },
      { "at it", "at them" },                        // ACCUSATIVE },
      { "atlas", "atlases|atlantes" },
      { "attorney general", "attorneys general" },
      { "attorney of record", "attorneys of record" },
      { "aurora", "auroras|aurorae" },
      { "auto", "autos" },
      { "aviatrix", "aviatrixes|aviatrices" },
      { "Avignonese", "Avignonese" },
      { "axe", "axes" },
      { "axis", "axes" },
      { "Azerbaijanese", "Azerbaijanese" },
      { "bacillus", "bacilli" },
      { "bacterium", "bacteria" },
      { "Bahaman", "Bahamans" },
      { "Balinese", "Balinese" },
      { "bamboo", "bamboos" },
      { "banjo", "banjoes" },
      { "bass", "basses" },                         // INSTRUMENT, NOT FISH
      { "basso", "bassos|bassi" },
      { "bathos", "bathoses" },
      { "beau", "beaus|beaux" },
      { "beef", "beefs|beeves" },
      { "beneath it", "beneath them" },                   // ACCUSATIVE
      { "Bengalese", "Bengalese" },
      { "bent", "bents" },
      { "Bernese", "Bernese" },
      { "Bhutanese", "Bhutanese" },
      { "bias", "biases" },
      { "biceps", "biceps" },
      { "bison", "bisons|bison" },
      { "Bolognese", "Bolognese" },
      { "bonus", "bonuses" },
      { "Borghese", "Borghese" },
      { "boss", "bosses" },
      { "Bostonese", "Bostonese" },
      { "box", "boxes" },
      { "boy", "boys" },
      { "bravo", "bravoes" },
      { "bream", "bream" },
      { "breeches", "breeches" },
      { "bride-to-be", "brides-to-be" },
      { "britches", "britches" },
      { "bronchitis", "bronchitises|bronchitides" },
      { "bronchus", "bronchi" },
      { "brother", "brothers|brethren" },
      { "buffalo", "buffaloes|buffalo" },
      { "Buginese", "Buginese" },
      { "buoy", "buoys" },
      { "bureau", "bureaus|bureaux" },
      { "Burman", "Burmans" },
      { "Burmese", "Burmese" },
      { "bursitis", "bursitises|bursitides" },
      { "bus", "buses" },
      { "buzz", "buzzes" },
      { "by it", "by them" },                        // ACCUSATIVE" },
      { "caddis", "caddises" },
      { "cake", "cakes" },
      { "Calabrese", "Calabrese" },
      { "calf", "calves" },
      { "callus", "calluses" },
      { "Camaldolese", "Camaldolese" },
      { "cameo", "cameos" },
      { "campus", "campuses" },
      { "can", "cans" },
      { "candelabrum", "candelabra" },
      { "cannabis", "cannabises" },
      { "canto", "cantos" },
      { "Cantonese", "Cantonese" },
      { "cantus", "cantus" },
      { "canvas", "canvases" },
      { "CAPITAL", "CAPITALS" },
      { "carcinoma", "carcinomas|carcinomata" },
      { "care", "cares" },
      { "cargo", "cargoes" },
      { "Carlylese", "Carlylese" },
      { "carp", "carp" },
      { "Cassinese", "Cassinese" },
      { "cat", "cats" },
      { "catfish", "catfish" },
      { "Celanese", "Celanese" },
      { "Ceylonese", "Ceylonese" },
      { "chairman", "chairmen" },
      { "chamois", "chamois" },
      { "chaos", "chaoses" },
      { "chapeau", "chapeaus|chapeaux" },
      { "charisma", "charismas|charismata" },
      { "chassis", "chassis" },
      { "chateau", "chateaus|chateaux" },
      { "cherub", "cherubs|cherubim" },
      { "chickenpox", "chickenpox" },
      { "chief", "chiefs" },
      { "child", "children" },
      { "Chinese", "Chinese" },
      { "chorus", "choruses" },
      { "chrysalis", "chrysalises|chrysalides" },
      { "church", "churches" },
      { "cicatrix", "cicatrixes|cicatrices" },
      { "circus", "circuses" },
      { "class", "classes" },
      { "clippers", "clippers" },
      { "clitoris", "clitorises|clitorides" },
      { "cod", "cod" },
      { "codex", "codices" },
      { "coitus", "coitus" },
      { "commando", "commandos" },
      { "compendium", "compendiums|compendia" },
      { "Congoese", "Congoese" },
      { "Congolese", "Congolese" },
      { "conspectus", "conspectuses" },
      { "contralto", "contraltos|contralti" },
      { "contretemps", "contretemps" },
      { "conundrum", "conundrums" },
      { "corps", "corps" },
      { "corpus", "corpuses|corpora" },
      { "cortex", "cortexes|cortices" },
      { "cosmos", "cosmoses" },
      { "court martial", "courts martial" },
      { "cow", "cows|kine" },
      { "cranium", "craniums|crania" },
      { "crescendo", "crescendos" },
      { "criterion", "criteria" },
      { "curriculum", "curriculums|curricula" },
      { "dais", "daises" },
      { "data point", "data points" },
      { "datum", "data" },
      { "debris", "debris" },
      { "decorum", "decorums" },
      { "deer", "deer" },
      { "delphinium", "delphiniums" },
      { "desideratum", "desiderata" },
      { "diabetes", "diabetes" },
      { "dictum", "dictums|dicta" },
      { "digitalis", "digitalises" },
      { "dingo", "dingoes" },
      { "diploma", "diplomas|diplomata" },
      { "discus", "discuses" },
      { "dish", "dishes" },
      { "ditto", "dittos" },
      { "djinn", "djinn" },
      { "dog", "dogs" },
      { "dogma", "dogmas|dogmata" },
      { "dominatrix", "dominatrixes|dominatrices" },
      { "domino", "dominoes" },
      { "Dongolese", "Dongolese" },
      { "drama", "dramas|dramata" },
      { "drum", "drums" },
      { "dwarf", "dwarves" },
      { "dynamo", "dynamos" },
      { "edema", "edemas|edemata" },
      { "eland", "elands|eland" },
      { "elf", "elves" },
      { "elk", "elks|elk" },
      { "embryo", "embryos" },
      { "emporium", "emporiums|emporia" },
      { "encephalitis", "encephalitises|encephalitides" },
      { "enconium", "enconiums|enconia" },
      { "enema", "enemas|enemata" },
      { "enigma", "enigmas|enigmata" },
      { "epidermis", "epidermises" },
      { "epididymis", "epididymises|epididymides" },
      { "erratum", "errata" },
      { "ethos", "ethoses" },
      { "eucalyptus", "eucalyptuses" },
      { "extremum", "extrema" },
      { "eyas", "eyases" },
      { "factotum", "factotums" },
      { "Faroese", "Faroese" },
      { "fauna", "faunas|faunae" },
      { "fax", "faxes" },
      { "Ferrarese", "Ferrarese" },
      { "ferry", "ferries" },
      { "fetus", "fetuses" },
      { "fiance", "fiances" },
      { "fiancee", "fiancees" },
      { "fiasco", "fiascos" },
      { "fish", "fish" },
      { "fizz", "fizzes" },
      { "flamingo", "flamingoes" },
      { "flora", "floras|florae" },
      { "flounder", "flounder" },
      { "focus", "focuses|foci" },
      { "foetus", "foetuses" },
      { "folio", "folios" },
      { "Foochowese", "Foochowese" },
      { "foot", "feet" },
      { "foramen", "foramens|foramina" },
      { "formula", "formulas|formulae" },
      { "forum", "forums" },
      { "fox", "foxes" },
      { "from him", "from them" },
      { "from it", "from them" },                      // ACCUSATIVE
      { "fungus", "funguses|fungi" },
      { "Gabunese", "Gabunese" },
      { "gallows", "gallows" },
      { "ganglion", "ganglions|ganglia" },
      { "gas", "gases" },
      { "gateau", "gateaus|gateaux" },
      { "generalissimo", "generalissimos" },
      { "Genevese", "Genevese" },
      { "genie", "genies|genii" },
      { "genius", "geniuses|genii" },
      { "Genoese", "Genoese" },
      { "genus", "genera" },
      { "German", "Germans" },
      { "ghetto", "ghettos" },
      { "Gilbertese", "Gilbertese" },
      { "glottis", "glottises" },
      { "Goanese", "Goanese" },
      { "goose", "geese" },
      { "Governor General", "Governors General" },
      { "goy", "goys|goyim" },
      { "graffiti", "graffiti" },
      { "graffito", "graffiti" },
      { "guano", "guanos" },
      { "guardsman", "guardsmen" },
      { "Guianese", "Guianese" },
      { "gumma", "gummas|gummata" },
      { "gymnasium", "gymnasiums|gymnasia" },
      { "Hainanese", "Hainanese" },
      { "handkerchief", "handkerchiefs" },
      { "Hararese", "Hararese" },
      { "Harlemese", "Harlemese" },
      { "harmonium", "harmoniums" },
      { "has-been", "has-beens" },
      { "Havanese", "Havanese" },
      { "he", "they" },
      { "headquarters", "headquarters" },
      { "Heavenese", "Heavenese" },
      { "helix", "helices" },
      { "hepatitis", "hepatitises|hepatitides" },
      { "her", "them" },                           // PRONOUN
      { "hero", "heroes" },
      { "herpes", "herpes" },
      { "hers", "theirs" },                         // POSSESSIVE NOUN
      { "herself", "themselves" },
      { "hiatus", "hiatuses|hiatus" },
      { "highlight", "highlights" },
      { "hijinks", "hijinks" },
      { "him", "them" },
      { "himself", "themselves" },
      { "hippopotamus", "hippopotamuses|hippopotami" },
      { "Hiroshiman", "Hiroshimans" },
      { "his", "theirs" },                         // POSSESSIVE NOUN
      { "honorarium", "honorariums|honoraria" },
      { "hoof", "hoofs|hooves" },
      { "Hoosierese", "Hoosierese" },
      { "Hottentotese", "Hottentotese" },
      { "house", "houses" },
      { "housewife", "housewives" },
      { "hubris", "hubrises" },
      { "human", "humans" },
      { "Hunanese", "Hunanese" },
      { "hydra", "hydras|hydrae" },
      { "hyperbaton", "hyperbata" },
      { "hyperbola", "hyperbolas|hyperbolae" },
      { "I", "we" },
      { "ibis", "ibises" },
      { "ignoramus", "ignoramuses" },
      { "impetus", "impetuses|impetus" },
      { "incubus", "incubuses|incubi" },
      { "index", "indexes|indices" },
      { "Indochinese", "Indochinese" },
      { "inferno", "infernos" },
      { "innings", "innings" },
      { "Inspector General", "Inspectors General" },
      { "interregnum", "interregnums|interregna" },
      { "iris", "irises|irides" },
      { "it", "they" },                           // NOMINATIVE
      { "itself", "themselves" },
      { "jackanapes", "jackanapes" },
      { "Japanese", "Japanese" },
      { "Javanese", "Javanese" },
      { "jerry", "jerries" },
      { "jinx", "jinxes" },
      { "Johnsonese", "Johnsonese" },
      { "Jones", "Joneses" },
      { "jumbo", "jumbos" },
      { "Kanarese", "Kanarese" },
      { "Kiplingese", "Kiplingese" },
      { "knife", "knives" },
      { "Kongoese", "Kongoese" },
      { "Kongolese", "Kongolese" },
      { "lacuna", "lacunas|lacunae" },
      { "lady in waiting", "ladies in waiting" },
      { "Lapponese", "Lapponese" },
      { "larynx", "larynxes|larynges" },
      { "latex", "latexes|latices" },
      { "leaf", "leaves" },
      { "lemma", "lemmas|lemmata" },
      { "lens", "lenses" },
      { "Leonese", "Leonese" },
      { "lick of the cat", "licks of the cat" },
      { "Lieutenant General", "Lieutenant Generals" },
      { "life", "lives" },
      { "Liman", "Limans" },
      { "lingo", "lingos" },
      { "loaf", "loaves" },
      { "locus", "loci" },
      { "Londonese", "Londonese" },
      { "Lorrainese", "Lorrainese" },
      { "lothario", "lotharios" },
      { "louse", "lice" },
      { "Lucchese", "Lucchese" },
      { "lumbago", "lumbagos" },
      { "lumen", "lumens|lumina" },
      { "lustrum", "lustrums|lustra" },
      { "lyceum", "lyceums" },
      { "lymphoma", "lymphomas|lymphomata" },
      { "lynx", "lynxes" },
      { "Lyonese", "Lyonese" },
      { "M.I.A.", "M.I.A.s" },
      { "Macanese", "Macanese" },
      { "Macassarese", "Macassarese" },
      { "mackerel", "mackerel" },
      { "Madurese", "Madurese" },
      { "magma", "magmas|magmata" },
      { "magneto", "magnetos" },
      { "Major General", "Major Generals" },
      { "Malabarese", "Malabarese" },
      { "Maltese", "Maltese" },
      { "man", "men" },
      { "mandamus", "mandamuses" },
      { "manifesto", "manifestos" },
      { "mantis", "mantises" },
      { "marquis", "marquises" },
      { "Mary", "Marys" },
      { "maximum", "maximums|maxima" },
      { "measles", "measles" },
      { "medico", "medicos" },
      { "medium", "mediums|media" },
      { "medusa", "medusas|medusae" },
      { "memorandum", "memorandums|memoranda" },
      { "meniscus", "menisci" },
      { "Messinese", "Messinese" },
      { "metamorphosis", "metamorphoses" },
      { "metropolis", "metropolises" },
      { "mews", "mews" },
      { "miasma", "miasmas|miasmata" },
      { "Milanese", "Milanese" },
      { "milieu", "milieus|milieux" },
      { "millennium", "millenniums|millennia" },
      { "minimum", "minimums|minima" },
      { "minx", "minxes" },
      { "miss", "misses" },
      { "mittamus", "mittamuses" },
      { "Modenese", "Modenese" },
      { "momentum", "momentums|momenta" },
      { "money", "monies" },
      { "mongoose", "mongooses" },
      { "moose", "mooses|moose" },
      { "mother-in-law", "mothers-in-law" },
      { "mouse", "mice" },
      { "mumps", "mumps" },
      { "Muranese", "Muranese" },
      { "murex", "murices" },
      { "museum", "museums" },
      { "mustachio", "mustachios" },
      { "myself", "ourselves" },
      { "mythos", "mythoi" },
      { "Nakayaman", "Nakayamans" },
      { "Nankingese", "Nankingese" },
      { "nasturtium", "nasturtiums" },
      { "Navarrese", "Navarrese" },
      { "nebula", "nebulas|nebulae" },
      { "Nepalese", "Nepalese" },
      { "neuritis", "neuritises|neuritides" },
      { "neurosis", "neuroses" },
      { "news", "news" },
      { "nexus", "nexus" },
      { "Niasese", "Niasese" },
      { "Nicobarese", "Nicobarese" },
      { "nimbus", "nimbuses|nimbi" },
      { "Nipponese", "Nipponese" },
      { "no", "noes" },
      { "nostrum", "nostrums" },
      { "noumenon", "noumena" },
      { "nova", "novas|novae" },
      { "nucleolus", "nucleoluses|nucleoli" },
      { "nucleus", "nuclei" },
      { "numen", "numina" },
      { "oaf", "oafs" },
      { "occiput", "occiputs|occipita" },
      { "octavo", "octavos" },
      { "octopus", "octopuses|octopodes" },
      { "oedema", "oedemas|oedemata" },
      { "Oklahoman", "Oklahomans" },
      { "omnibus", "omnibuses" },
      { "on it", "on them" },                        // ACCUSATIVE
      { "onus", "onuses" },
      { "opera", "operas" },
      { "optimum", "optimums|optima" },
      { "opus", "opuses|opera" },
      { "organon", "organa" },
      { "ovum", "ova" },
      { "ox", "oxen" },
      { "oxymoron", "oxymorons|oxymora" },
      { "Panaman", "Panamans" },
      { "parabola", "parabolas|parabolae" },
      { "Parmese", "Parmese" },
      { "pathos", "pathoses" },
      { "pegasus", "pegasuses" },
      { "Pekingese", "Pekingese" },
      { "pelvis", "pelvises" },
      { "pendulum", "pendulums" },
      { "penis", "penises|penes" },
      { "penumbra", "penumbras|penumbrae" },
      { "perihelion", "perihelia" },
      { "person", "people|persons" },
      { "persona", "personae" },
      { "petroleum", "petroleums" },
      { "phalanx", "phalanxes|phalanges" },
      { "PhD", "PhDs" },
      { "phenomenon", "phenomena" },
      { "philtrum", "philtrums" },
      { "photo", "photos" },
      { "phylum", "phylums|phyla" },
      { "piano", "pianos|piani" },
      { "Piedmontese", "Piedmontese" },
      { "pincer", "pincers" },
      { "pincers", "pincers" },
      { "Pistoiese", "Pistoiese" },
      { "plateau", "plateaus|plateaux" },
      { "play", "plays" },
      { "plexus", "plexuses|plexus" },
      { "pliers", "pliers" },
      { "polis", "polises" },
      { "Polonese", "Polonese" },
      { "pontifex", "pontifexes|pontifices" },
      { "portmanteau", "portmanteaus|portmanteaux" },
      { "Portuguese", "Portuguese" },
      { "potato", "potatoes" },
      { "pox", "pox" },
      { "pragma", "pragmas|pragmata" },
      { "premium", "premiums" },
      { "prima donna", "prima donnas|prime donne" },
      { "pro", "pros" },
      { "proceedings", "proceedings" },
      { "prolegomenon", "prolegomena" },
      { "proof", "proofs" },
      { "proof of concept", "proofs of concept" },
      { "prosecutrix", "prosecutrixes|prosecutrices" },
      { "prospectus", "prospectuses|prospectus" },
      { "protozoan", "protozoans" },
      { "protozoon", "protozoa" },
      { "quantum", "quantums|quanta" },
      { "quartermaster general", "quartermasters general" },
      { "quarto", "quartos" },
      { "quorum", "quorums" },
      { "rabies", "rabies" },
      { "radius", "radiuses|radii" },
      { "radix", "radices" },
      { "rebus", "rebuses" },
      { "reindeer", "reindeer" },
      { "rhino", "rhinos" },
      { "rhinoceros", "rhinoceroses|rhinoceros" },
      { "Romagnese", "Romagnese" },
      { "Romanese", "Romanese" },
      { "romeo", "romeos" },
      { "roof", "roofs" },
      { "rostrum", "rostrums|rostra" },
      { "ruckus", "ruckuses" },
      { "salmon", "salmon" },
      { "Sangirese", "Sangirese" },
      { "Sarawakese", "Sarawakese" },
      { "sarcoma", "sarcomas|sarcomata" },
      { "sassafras", "sassafrases" },
      { "saw", "saws" },
      { "scarf", "scarves" },
      { "schema", "schemas|schemata" },
      { "scissors", "scissors" },
      { "Scotsman", "Scotsmen" },
      { "sea-bass", "sea-bass" },
      { "self", "selves" },
      { "Selman", "Selmans" },
      { "Senegalese", "Senegalese" },
      { "seraph", "seraphs|seraphim" },
      { "series", "series" },
      { "Shavese", "Shavese" },
      { "Shawanese", "Shawanese" },
      { "she", "they" },
      { "sheaf", "sheaves" },
      { "shears", "shears" },
      { "sheep", "sheep" },
      { "shelf", "shelves" },
      { "Siamese", "Siamese" },
      { "siemens", "siemens" },
      { "Sienese", "Sienese" },
      { "Sikkimese", "Sikkimese" },
      { "silex", "silices" },
      { "simplex", "simplexes|simplices" },
      { "Singhalese", "Singhalese" },
      { "Sinhalese", "Sinhalese" },
      { "sinus", "sinuses|sinus" },
      { "size", "sizes" },
      { "smallpox", "smallpox" },
      { "Smith", "Smiths" },
      { "Sogdianese", "Sogdianese" },
      { "soliloquy", "soliloquies" },
      { "solo", "solos|soli" },
      { "soma", "somas|somata" },
      { "son of a bitch", "sons of bitches" },
      { "Sonaman", "Sonamans" },
      { "soprano", "sopranos|soprani" },
      { "species", "species" },
      { "spectrum", "spectrums|spectra" },
      { "speculum", "speculums|specula" },
      { "spermatozoon", "spermatozoa" },
      { "sphinx", "sphinxes|sphinges" },
      { "spokesperson", "spokespeople|spokespersons" },
      { "stadium", "stadiums|stadia" },
      { "stamen", "stamens|stamina" },
      { "status", "statuses|status" },
      { "stereo", "stereos" },
      { "stigma", "stigmas|stigmata" },
      { "stimulus", "stimuli" },
      { "stoma", "stomas|stomata" },
      { "storey", "storeys" },
      { "story", "stories" },
      { "stratum", "strata" },
      { "strife", "strifes" },
      { "stylo", "stylos" },
      { "stylus", "styluses|styli" },
      { "succubus", "succubuses|succubi" },
      { "Sudanese", "Sudanese" },
      { "suffix", "suffixes" },
      { "Sundanese", "Sundanese" },
      { "superior", "superiors" },
      { "Surgeon-General", "Surgeons-General" },
      { "surplus", "surpluses" },
      { "Swahilese", "Swahilese" },
      { "swine", "swines|swine" },
      { "syringe", "syringes" },
      { "syrinx", "syrinxes|syringes" },
      { "tableau", "tableaus|tableaux" },
      { "Tacoman", "Tacomans" },
      { "tattoo", "tattoos" },
      { "tempo", "tempos|tempi" },
      { "Tenggerese", "Tenggerese" },
      { "testatrix", "testatrixes|testatrices" },
      { "testes", "testes" },
      { "testis", "testes" },
      { "themself", "themselves" },                     // ugly but gaining currency" },
      { "they", "they" },                           // for indeterminate gender" },
      { "thought", "thoughts" },
      { "Times", "Timeses" },
      { "Timorese", "Timorese" },
      { "Tirolese", "Tirolese" },
      { "to her", "to them" },
      { "to herself", "to themselves" },
      { "to him", "to them" },
      { "to himself", "to themselves" },
      { "to it", "to them" },
      { "to it", "to them" },                        // ACCUSATIVE" },
      { "to itself", "to themselves" },
      { "to me", "to us" },
      { "to myself", "to ourselves" },
      { "to them", "to them" },                        // for indeterminate gender" },
      { "to themself", "to themselves" },                  // ugly but gaining currency" },
      { "to you", "to you" },
      { "to yourself", "to yourselves" },
      { "Tocharese", "Tocharese" },
      { "tomato", "tomatoes" },
      { "Tonkinese", "Tonkinese" },
      { "tonsillitis", "tonsillitises|tonsillitides" },
      { "tooth", "teeth" },
      { "Torinese", "Torinese" },
      { "torus", "toruses|tori" },
      { "trapezium", "trapeziums|trapezia" },
      { "trauma", "traumas|traumata" },
      { "travois", "travois" },
      { "trellis", "trellises" },
      { "trilby", "trilbys" },
      { "trousers", "trousers" },
      { "trousseau", "trousseaus|trousseaux" },
      { "trout", "trout" },
      { "try", "tries" },
      { "tuna", "tuna" },
      { "turf", "turfs|turves" },
      { "Tyrolese", "Tyrolese" },
      { "ultimatum", "ultimatums|ultimata" },
      { "umbilicus", "umbilicuses|umbilici" },
      { "umbra", "umbras|umbrae" },
      { "uterus", "uteruses|uteri" },
      { "vacuum", "vacuums|vacua" },
      { "vellum", "vellums" },
      { "velum", "velums|vela" },
      { "Vermontese", "Vermontese" },
      { "Veronese", "Veronese" },
      { "vertebra", "vertebrae" },
      { "vertex", "vertexes|vertices" },
      { "Viennese", "Viennese" },
      { "Vietnamese", "Vietnamese" },
      { "virtuoso", "virtuosos|virtuosi" },
      { "virus", "viruses" },
      { "vixen", "vixens" },
      { "vortex", "vortexes|vortices" },
      { "walrus", "walruses" },
      { "Wenchowese", "Wenchowese" },
      { "wharf", "wharves" },
      { "whiting", "whiting" },
      { "Whitmanese", "Whitmanese" },
      { "widget", "widgets" },
      { "wife", "wives" },
      { "wildebeest", "wildebeests|wildebeest" },
      { "will", "wills" },
      { "wish", "wishes" },
      { "with him", "with them" },
      { "with it", "with them" },                      // ACCUSATIVE
      { "wolf", "wolves" },
      { "woman", "women" },
      { "woman of substance", "women of substance" },
      { "woodlouse", "woodlice" },
      { "Yakiman", "Yakimans" },
      { "Yengeese", "Yengeese" },
      { "Yokohaman", "Yokohamans" },
      { "you", "you" },
      { "yourself", "yourselves" },
      { "Yuman", "Yumans" },
      { "Yunnanese", "Yunnanese" },
      { "zero", "zeros" },
      { "zoon", "zoa" },

  };
}